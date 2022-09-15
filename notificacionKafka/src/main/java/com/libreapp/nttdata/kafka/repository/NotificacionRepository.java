package com.libreapp.nttdata.kafka.repository;

import com.libreapp.nttdata.kafka.model.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
}
