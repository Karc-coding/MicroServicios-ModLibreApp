package com.libreapp.nttdata.validar.producto.controller;

import com.libreapp.nttdata.openfeign.validar.producto.ProductoCheckResponse;
import com.libreapp.nttdata.validar.producto.service.ProductoCheckService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/product-check")
public class ProductoCheckController {

    private final ProductoCheckService productoCheckService;

    @GetMapping
    public ProductoCheckResponse isRepeat(@RequestParam(name = "serie") String serie) {
        log.info("Validar serie de producto: ", serie);
        return new ProductoCheckResponse(productoCheckService.esRepetido(serie));
    }
}
