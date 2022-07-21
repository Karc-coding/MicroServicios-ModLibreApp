package com.libreapp.nttdata.notificacion.rabbitmq;

import com.libreapp.nttdata.notificacion.service.NotificacionService;
import com.libreapp.nttdata.openfeign.notificacion.NotificacionRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificacionProduct {

    private NotificacionService notificacionService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void product(NotificacionRequest notificacionRequest) {
        log.info("Consumido {} desde cola", notificacionRequest);
        notificacionService.enviarConfirmacionRegistro(notificacionRequest);
    }

}
