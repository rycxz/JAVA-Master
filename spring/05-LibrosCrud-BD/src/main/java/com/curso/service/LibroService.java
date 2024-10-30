package com.curso.service;

import java.util.List;

import com.curso.model.Libro;
/**
 * 
 * @author Ricardo
 *
 */

public interface LibroService {
	List<Libro> libros();
	Libro buscarLibro(int isbn);
	void altaLibro(Libro lib);
	void actualizarLibro(Libro lib);
	List<Libro> elminarLibro(int isbn);
}
