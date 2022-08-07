package com.libreapp.nttdata.validar.producto.service;

import com.libreapp.nttdata.validar.producto.model.ProductoCheck;

public interface ProductoCheckService {
    public ProductoCheck getProductoCheck(String serie);
    public boolean esRepetido(String serie);
}
