package com.libreapp.nttdata.notificacion.repository;

import com.libreapp.nttdata.notificacion.model.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
}
