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
    public ProductoCheck getProductoCheck(String serie) {
        return repo.findByProductoSerie(serie).orElse(null);
    }

    @Override
    public boolean esRepetido(String serie) {
        boolean repetido = true;
        ProductoCheck productoCheck = getProductoCheck(serie);
        if (productoCheck == null) { repetido = false; }

        repo.save(ProductoCheck.builder().productoSerie(serie).repetido(repetido).fechaRegistro(new Date()).build());
        return repetido;
    }
}
