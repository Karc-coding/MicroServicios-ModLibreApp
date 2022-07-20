package com.libreapp.nttdata.producto.service.impl;

import com.libreapp.nttdata.producto.controller.LibroRequest;
import com.libreapp.nttdata.producto.model.Libro;
import com.libreapp.nttdata.producto.repository.LibroRepository;
import com.libreapp.nttdata.producto.service.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LibroServiceImpl implements LibroService {

    private LibroRepository repo;

    @Override
    public List<Libro> listAll() {
        return repo.findAll();
    }

    @Override
    public Libro createLibro(Libro libro) {



        return repo.save(libro);
    }

    @Override
    public Libro updateLibro(LibroRequest libroRequest) {
        return null;
    }

    /*@Override
    public Libro updateLibro(Libro libro) {
        Libro book = getLibro(libro.getId());
        if (book == null)
            return null;
        return repo.save(libro);
    }*/

    @Override
    public Libro deleteLibro(long id) {
        Libro book = getLibro(id);
        if (book == null)
            return null;
        repo.deleteById(id);
        return book;
    }

    @Override
    public Libro getLibro(long id) {
        return repo.findById(id).orElse(null);
    }
}
