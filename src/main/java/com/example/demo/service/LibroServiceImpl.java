package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Libro;
import com.example.demo.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> obtenerTodos() {
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libro> obtenerPorId(Long id) {
        return libroRepository.findById(id);
    }

    @Override
    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro actualizarLibro(Long id, Libro libroDetalles) {
        if (libroRepository.existsById(id)) {
            libroDetalles.setId(id);
            return libroRepository.save(libroDetalles);
        }
        return null;
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }
}