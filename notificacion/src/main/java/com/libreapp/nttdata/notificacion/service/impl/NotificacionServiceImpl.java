package com.libreapp.nttdata.notificacion.service.impl;

import com.libreapp.nttdata.notificacion.model.Notificacion;
import com.libreapp.nttdata.notificacion.repository.NotificacionRepository;
import com.libreapp.nttdata.notificacion.service.NotificacionService;
import com.libreapp.nttdata.openfeign.notificacion.NotificacionRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@AllArgsConstructor
@Service
public class NotificacionServiceImpl implements NotificacionService {

    private NotificacionRepository repo;

    @Override
    public boolean enviarConfirmacionRegistro(NotificacionRequest notificacionRequest) {
        repo.save(Notificacion.builder()
                .productoId(notificacionRequest.productoId())
                .title(notificacionRequest.title())
                .categoria(notificacionRequest.categoria())
                .autor(notificacionRequest.autor())
                .remitente("Karc Corp.")
                .mensaje(notificacionRequest.mensaje())
                .horaRegistro(new Date())
                .build());
        return false;
    }
}
