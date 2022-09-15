package com.libreapp.nttdata.kafka.service;

import com.libreapp.nttdata.openfeign.notificacionkafka.NotificacionKafkaRequest;

public interface NotificacionService {
    public boolean enviarConfirmacionRegistro(NotificacionKafkaRequest notificacionKafkaRequest);
}
