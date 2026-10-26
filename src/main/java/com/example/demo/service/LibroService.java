package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Libro;

public interface LibroService {

    List<Libro> obtenerTodos();

    Optional<Libro> obtenerPorId(Long id);

    Libro guardarLibro(Libro libro);

    Libro actualizarLibro(Long id, Libro libroDetalles);

    void eliminarLibro(Long id);
}