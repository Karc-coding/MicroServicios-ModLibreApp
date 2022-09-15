package com.libreapp.nttdata.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notifications")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id", nullable = false, unique = true)
    private Long productoId;

    @Column(nullable = false, length = 125)
    private String title;

    @Column(nullable = false, length = 75)
    private String categoria;

    @Column(nullable = false, length = 60)
    private String autor;

    @Column(nullable = false, length = 75)
    private String remitente;

    @Column(nullable = false, length = 125)
    private String mensaje;

    @Column(name = "date_register", nullable = false)
    private Date horaRegistro;
}
