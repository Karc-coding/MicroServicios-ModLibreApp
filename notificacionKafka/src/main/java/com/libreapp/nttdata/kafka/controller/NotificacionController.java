package com.libreapp.nttdata.kafka.controller;

import com.libreapp.nttdata.kafka.service.NotificacionService;
import com.libreapp.nttdata.openfeign.notificacionkafka.NotificacionKafkaRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/notificacionkafka")
public class NotificacionController {

    private final NotificacionService notificacionService;

    @PostMapping
    public void enviarConfirmacionRegistro(@RequestBody NotificacionKafkaRequest notificacionKafkaRequest) {
        log.info("Nueva notificacion... {}", notificacionKafkaRequest);
        notificacionService.enviarConfirmacionRegistro(notificacionKafkaRequest);
    }

}
