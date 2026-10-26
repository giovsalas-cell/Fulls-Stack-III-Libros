package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Libro;
import com.example.demo.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // GET: Obtener todos los libros
    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.obtenerTodos();
    }

    // GET: Obtener un libro por su ID específico
    @GetMapping("/{id}")
    public Optional<Libro> obtenerLibroPorId(@PathVariable Long id) {
        return libroService.obtenerPorId(id);
    }

    // POST: Crear un nuevo libro
    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro) {
        return libroService.guardarLibro(libro);
    }

    // PUT: Actualizar un libro existente por su ID
    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable Long id, @RequestBody Libro libro) {
        return libroService.actualizarLibro(id, libro);
    }

    // DELETE: Eliminar un libro por su ID
    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.eliminarLibro(id);
    }
}