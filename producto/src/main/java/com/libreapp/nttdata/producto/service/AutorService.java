package com.libreapp.nttdata.producto.service;

import com.libreapp.nttdata.producto.model.Autor;

import java.util.List;

public interface AutorService {

    public List<Autor> listAll();
    public Autor getAutor(int id);

}
