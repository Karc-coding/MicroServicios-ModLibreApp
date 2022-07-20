package com.libreapp.nttdata.validar.producto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("validarproducto")
public interface ProductoCheckClient {
    @GetMapping(path = "api/v1/product-check")
    public ProductoCheckResponse isRepeat(@RequestParam(name = "id") long id, @RequestParam(name = "serie") String serie);
}
