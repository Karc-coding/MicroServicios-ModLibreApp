package com.libreapp.nttdata.validar.producto.repository;

import com.libreapp.nttdata.validar.producto.model.ProductoCheck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoCheckRepository extends JpaRepository<ProductoCheck, Integer> {

    Optional<ProductoCheck> findByProductoSerie(String serie);
}
