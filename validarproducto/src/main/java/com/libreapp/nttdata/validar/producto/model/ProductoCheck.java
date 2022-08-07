package com.libreapp.nttdata.validar.producto.model;

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
@Table(name = "product_check")
public class ProductoCheck {

    @Id
    @SequenceGenerator(
            name = "clientecheck_id_sequence",
            sequenceName = "clientecheck_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "clientecheck_id_sequence"
    )
    private Integer id;

    @Column(name = "product_serie", nullable = false)
    private String productoSerie;

    @Column(name = "repeat", nullable = false)
    private Boolean repetido;

    @Column(name = "date_register", nullable = false)
    private Date fechaRegistro;

}
