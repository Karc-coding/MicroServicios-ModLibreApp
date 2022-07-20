package com.libreapp.nttdata.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@EnableEurekaClient
@SpringBootApplication
public class ProductoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductoApplication.class, args);
        //generarDatos();


        /*try {
            String backup = "docker exec -i modlibreapp-mysql-1 mysql -ukrojasco --password=12345 producto  < C:\\Users\\Usuario\\Desktop\\bootcamp\\tarea_proyecto\\ModLibreApp\\producto\\src\\main\\resources\\data.sql";
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(backup);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    static void generarDatos(){
        try {
            final String commands[] = {"docker", "exec", "-i", "modlibreapp-mysql-1", "mysql", "-ukrojasco", "--password=12345", "producto", "<", "C:\\Users\\Usuario\\Desktop\\bootcamp\\tarea_proyecto\\ModLibreApp\\producto\\src\\main\\resources\\data.sql"};
            Process process = new ProcessBuilder(commands).start();

            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            try {
                int exitValue = process.waitFor();
                System.out.println("\nCódigo de salida: "+ exitValue);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
