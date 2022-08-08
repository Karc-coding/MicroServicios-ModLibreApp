package com.libreapp.nttdata.producto;

import com.libreapp.nttdata.producto.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.io.IOException;

@EnableFeignClients(
        basePackages = "com.libreapp.nttdata"
)
@PropertySources({
        @PropertySource("classpath:openfeign-${spring.profiles.active}.properties")
})
@EnableEurekaClient
@SpringBootApplication( scanBasePackages = {"com.libreapp.nttdata.producto", "com.libreapp.nttdata.queues"})
public class ProductoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductoApplication.class, args);
    }
}
