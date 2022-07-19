package com.libreapp.nttdata.producto.repository;

import com.libreapp.nttdata.producto.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
