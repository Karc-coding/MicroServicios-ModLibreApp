package com.libreapp.nttdata.kafka.service.impl;

import com.libreapp.nttdata.kafka.model.Notificacion;
import com.libreapp.nttdata.kafka.repository.NotificacionRepository;
import com.libreapp.nttdata.kafka.service.NotificacionService;
import com.libreapp.nttdata.openfeign.notificacionkafka.NotificacionKafkaRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@AllArgsConstructor
@Service
public class NotificacionServiceImpl implements NotificacionService {

    private NotificacionRepository repo;

    @Override
    public boolean enviarConfirmacionRegistro(NotificacionKafkaRequest notificacionKafkaRequest) {
        repo.save(Notificacion.builder()
                .productoId(notificacionKafkaRequest.productoId())
                .title(notificacionKafkaRequest.title())
                .categoria(notificacionKafkaRequest.categoria())
                .autor(notificacionKafkaRequest.autor())
                .remitente("Karc Corp.")
                .mensaje(notificacionKafkaRequest.mensaje())
                .horaRegistro(new Date())
                .build());
        return false;
    }
}
