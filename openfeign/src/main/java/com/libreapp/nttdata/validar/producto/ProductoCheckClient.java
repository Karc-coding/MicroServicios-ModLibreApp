package com.libreapp.nttdata.validar.producto;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("validarproducto")
public interface ProductoCheckClient {
}
