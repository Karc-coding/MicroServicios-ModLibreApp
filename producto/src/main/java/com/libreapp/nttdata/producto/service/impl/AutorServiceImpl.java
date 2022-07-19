package com.libreapp.nttdata.producto.service.impl;

import com.libreapp.nttdata.producto.model.Autor;
import com.libreapp.nttdata.producto.repository.AutorRepository;
import com.libreapp.nttdata.producto.service.AutorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AutorServiceImpl implements AutorService {

    private AutorRepository repo;

    @Override
    public List<Autor> listAll() {
        return repo.findAll();
    }

    @Override
    public Autor getAutor(int id) {
        return repo.findById(id).orElse(null);
    }
}
