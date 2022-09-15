package com.libreapp.nttdata.producto.service.impl;

import com.libreapp.nttdata.openfeign.notificacion.NotificacionRequest;
import com.libreapp.nttdata.openfeign.notificacionkafka.NotificacionKafkaRequest;
import com.libreapp.nttdata.openfeign.validar.producto.ProductoCheckClient;
import com.libreapp.nttdata.openfeign.validar.producto.ProductoCheckResponse;
import com.libreapp.nttdata.producto.controller.LibroRequest;
import com.libreapp.nttdata.producto.kafka.producer.ProductoProducer;
import com.libreapp.nttdata.producto.model.Libro;
import com.libreapp.nttdata.producto.repository.LibroRepository;
import com.libreapp.nttdata.producto.service.LibroService;
import com.libreapp.nttdata.queues.rabbitmq.RabbitMQMessageProducer;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class LibroServiceImpl implements LibroService {

    private LibroRepository repo;
    private ProductoCheckClient productoCheckClient;
    private RabbitMQMessageProducer rabbitMQMessageProducer;
    private ProductoProducer productoProducer;

    @Override
    public List<Libro> listAll() {
        return repo.findAll();
    }

    @Override
    public Libro createLibro(Libro libro) {
        return repo.save(libro);
    }

    @CircuitBreaker(name = "validatelibroCB", fallbackMethod = "fallValidateLibroCB")
    @Retry(name = "validatelibroRetry")
    public String validateLibro(Libro libro) {
        log.info("Inicio etodo validateLibro");
        ProductoCheckResponse response = productoCheckClient.isRepeat(libro.getSerie());
        if (response.repetido()){
            throw new IllegalStateException("El libro ya existe!!");
        }
        return "OK";
    }

    public String fallValidateLibroCB(Libro libro, Exception e) {
        return "NO_OK";
    }

    public void registerNotification(Libro libro) {
        NotificacionRequest notificacionRequest = new NotificacionRequest(libro.getId(),
                libro.getTitle(),
                libro.getCategoria().getName(),
                libro.getAutor().getNickname(),
                "El producto con serie " + libro.getSerie() + " ha sido registrado");

        rabbitMQMessageProducer.publish(
                notificacionRequest,
                "internal.exchange",
                "internal.notification.routing-key"
        );
    }

    public void registerNotificationKafka(Libro libro) {
        NotificacionKafkaRequest notificacionkafkaRequest = new NotificacionKafkaRequest(libro.getId(),
                libro.getTitle(),
                libro.getCategoria().getName(),
                libro.getAutor().getNickname(),
                "El producto con serie " + libro.getSerie() + " ha sido registrado");
        productoProducer.enviarMensaje(notificacionkafkaRequest);
    }

    @Override
    public Libro updateLibro(LibroRequest libroRequest) {
        Libro book = getLibro(libroRequest.id());
        if (book == null)
            return null;

        Libro libro =Libro.builder()
                .id(libroRequest.id())
                .title(libroRequest.title())
                .serie(libroRequest.serie())
                .yearBook(libroRequest.yearBook())
                .categoria(libroRequest.categoria())
                .price(libroRequest.price())
                .stock(libroRequest.stock())
                .autor(libroRequest.autor())
                .build();
        return repo.save(libro);
    }

    @Override
    public Libro deleteLibro(long id) {
        Libro book = getLibro(id);
        if (book == null)
            return null;
        repo.deleteById(id);
        return book;
    }

    @Override
    public Libro getLibro(long id) {
        return repo.findById(id).orElse(null);
    }
}
