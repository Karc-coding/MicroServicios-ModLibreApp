package com.libreapp.nttdata.producto.service;

import com.libreapp.nttdata.producto.model.Categoria;

import java.util.List;

public interface CategoriaService {

    public List<Categoria> listAll();
    public Categoria getCategoria(int id);

}
