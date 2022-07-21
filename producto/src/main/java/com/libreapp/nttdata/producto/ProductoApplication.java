package com.libreapp.nttdata.producto;

import com.libreapp.nttdata.producto.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.io.IOException;

@EnableFeignClients(
        basePackages = "com.libreapp.nttdata"
)
@EnableEurekaClient
@SpringBootApplication
public class ProductoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductoApplication.class, args);
        generarDatos();
    }

    static void generarDatos() {
        try {
            System.out.println("Ejecutando comando de insercion");
            ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "docker", "exec", "-i", "postgreslibapp", "psql", "-U", "krojasco", "producto", "<", "C:\\Users\\Usuario\\Desktop\\bootcamp\\tarea_proyecto\\ModLibreApp\\producto\\src\\main\\resources\\data.sql");
            pb.start();
            System.out.println("Ejecucion finalizada");
        } catch (IOException e) {
            System.out.println("Error al ejecutar comando de insercion");
            e.printStackTrace();
        }
    }
}
