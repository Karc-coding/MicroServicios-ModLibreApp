package com.libreapp.nttdata.producto.service.impl;

import com.libreapp.nttdata.producto.model.Categoria;
import com.libreapp.nttdata.producto.repository.CategoriaRepository;
import com.libreapp.nttdata.producto.service.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoriaServiceImpl implements CategoriaService {

    private CategoriaRepository repo;

    @Override
    public List<Categoria> listAll() {
        return repo.findAll();
    }

    @Override
    public Categoria getCategoria(int id) {
        return repo.findById(id).orElse(null);
    }
}
