package com.libreapp.nttdata.producto.service;

import com.libreapp.nttdata.producto.controller.LibroRequest;
import com.libreapp.nttdata.producto.model.Libro;

import java.util.List;

public interface LibroService {

    public List<Libro> listAll();
    public Libro createLibro(Libro libro);
    public Libro updateLibro(LibroRequest libroRequest);
    public Libro deleteLibro(long id);
    public Libro getLibro(long id);

}
