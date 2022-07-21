package com.libreapp.nttdata.notificacion.controller;

import com.libreapp.nttdata.notificacion.service.NotificacionService;
import com.libreapp.nttdata.openfeign.notificacion.NotificacionRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/notificacion")
public class NotificacionController {

    private final NotificacionService notificacionService;

    @PostMapping
    public void enviarConfirmacionRegistro(@RequestBody NotificacionRequest notificacionRequest) {
        log.info("Nueva notificacion... {}", notificacionRequest);
        notificacionService.enviarConfirmacionRegistro(notificacionRequest);
    }

}
