package com.libreapp.nttdata.validar.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ValidarProductoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ValidarProductoApplication.class, args);
    }
}
