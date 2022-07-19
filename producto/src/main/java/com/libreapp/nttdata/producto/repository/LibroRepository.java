package com.libreapp.nttdata.producto.repository;

import com.libreapp.nttdata.producto.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro,Long> {
}
