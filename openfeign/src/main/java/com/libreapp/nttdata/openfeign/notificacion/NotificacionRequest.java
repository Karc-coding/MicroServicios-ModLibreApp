package com.libreapp.nttdata.openfeign.notificacion;

public record NotificacionRequest(Long productoId, String title, String categoria, String autor, String mensaje) {
}
