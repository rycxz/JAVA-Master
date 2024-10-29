package com.curso.service;

import java.util.List;

import com.curso.model.Libro;
/**
 * 
 * @author Ricardo
 *
 */

public interface LibroService {
	public List<Libro> libros();
	public Libro buscarLibro(int isbn);
	public void altaLibro(Libro lib);
	public void actualizarLibro(Libro lib);
	public List<Libro> eliminarLibro(int isbn);
	
	

}
