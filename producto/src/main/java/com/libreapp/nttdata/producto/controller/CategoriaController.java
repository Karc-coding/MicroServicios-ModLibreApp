package com.libreapp.nttdata.producto.controller;

import com.libreapp.nttdata.producto.model.Autor;
import com.libreapp.nttdata.producto.model.Categoria;
import com.libreapp.nttdata.producto.service.CategoriaService;
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
@RequestMapping("api/v1/category")
public class CategoriaController {

    private final CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<?> listCategories() {
        List<Categoria> categorias = categoriaService.listAll();
        log.info("Listar categorias");
        return new ResponseEntity<>(categorias, categorias.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getCategories(@PathVariable("id") int id) {
        log.info("Obtener categorias: ", id);
        return new ResponseEntity<>(categoriaService.getCategoria(id), HttpStatus.OK);
    }
}
