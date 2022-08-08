package com.libreapp.nttdata.openfeign.validar.producto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "validarproducto",
        url = "${openfeign.validarproducto.url}"
)
public interface ProductoCheckClient {
    @GetMapping(path = "api/v1/product-check")
    public ProductoCheckResponse isRepeat(@RequestParam(name = "serie") String serie);
}
