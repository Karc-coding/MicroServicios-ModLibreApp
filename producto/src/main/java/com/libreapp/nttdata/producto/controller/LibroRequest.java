package com.libreapp.nttdata.producto.controller;

import com.libreapp.nttdata.producto.model.Autor;
import com.libreapp.nttdata.producto.model.Categoria;

public record LibroRequest(Long id, String title, String serie, String yearBook, Categoria categoria, Double price, Integer stock, Autor autor) {
}
