package com.libreapp.nttdata.validar.producto.service.impl;

import com.libreapp.nttdata.validar.producto.repository.ProductoCheckRepository;
import com.libreapp.nttdata.validar.producto.service.ProductoCheckService;
import com.libreapp.nttdata.validar.producto.model.ProductoCheck;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@AllArgsConstructor
@Service
public class ProductoCheckServiceImpl implements ProductoCheckService {

    private ProductoCheckRepository repo;

    @Override
    public boolean esRepetido(Long id, String serie) {
        repo.save(ProductoCheck.builder().productoId(id).productoSerie(serie).repetido(false).fechaRegistro(new Date()).build());
        return false;
    }
}
