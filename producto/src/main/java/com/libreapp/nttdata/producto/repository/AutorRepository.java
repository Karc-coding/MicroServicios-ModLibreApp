package com.libreapp.nttdata.producto.repository;

import com.libreapp.nttdata.producto.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
