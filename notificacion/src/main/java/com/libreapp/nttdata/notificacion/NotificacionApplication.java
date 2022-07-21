package com.libreapp.nttdata.notificacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class NotificacionApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificacionApplication.class, args);
    }
}
