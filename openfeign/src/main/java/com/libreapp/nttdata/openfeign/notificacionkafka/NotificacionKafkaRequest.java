package com.libreapp.nttdata.openfeign.notificacionkafka;

public record NotificacionKafkaRequest(Long productoId, String title, String categoria, String autor, String mensaje) {
}
