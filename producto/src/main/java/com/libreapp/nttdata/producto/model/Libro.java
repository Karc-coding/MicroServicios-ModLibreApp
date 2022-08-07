package com.libreapp.nttdata.producto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "{NotEmpty.book.title}")
    @Column(nullable = false, length = 125)
    private String title;

    @NotEmpty(message = "{NotEmpty.book.serie}")
    @Column(unique = true, nullable = false, length = 7)
    private String serie;

    @Column(name = "year_book", nullable = true, length = 4)
    private String yearBook;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categories_id", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @NotNull(message = "{NotNull.book.categoria}")
    private Categoria categoria;

    @NotNull(message = "{NotEmpty.book.price}")
    @Column(nullable = false, scale = 2, precision = 9)
    private Double price;

    @NotNull(message = "{NotEmpty.book.stock}")
    @Column(nullable = false, precision = 9)
    private Integer stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authors_id", nullable = false)
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @NotNull(message = "{NotNull.book.autor}")
    private Autor autor;
}
