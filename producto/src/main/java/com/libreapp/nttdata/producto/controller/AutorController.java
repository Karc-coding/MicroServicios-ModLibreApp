package com.libreapp.nttdata.producto.controller;

import com.libreapp.nttdata.producto.model.Autor;
import com.libreapp.nttdata.producto.model.Libro;
import com.libreapp.nttdata.producto.service.AutorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("API/v1/author")
public class AutorController {

    private final AutorService autorService;

    @GetMapping
    public ResponseEntity<?> listAuthors() {
        List<Autor> autores = autorService.listAll();
        log.info("Listar autores");
        return new ResponseEntity<>(autores, autores.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getAuthors(@PathVariable("id") int id) {
        log.info("Obtener autores: ", id);
        return new ResponseEntity<>(autorService.getAutor(id), HttpStatus.OK);
    }
}
