package com.libreapp.nttdata.notificacion.service;

import com.libreapp.nttdata.openfeign.notificacion.NotificacionRequest;

public interface NotificacionService {
    public boolean enviarConfirmacionRegistro(NotificacionRequest notificacionRequest);
}
