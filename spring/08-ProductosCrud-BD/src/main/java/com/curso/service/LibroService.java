package com.curso.service;

import java.util.List;

import com.curso.model.Productos;
/**
 * 
 * @author Ricardo
 *
 */

public interface LibroService {
	List<Productos> productos();
	Productos buscarLibro(int isbn);
	void altaLibro(Productos lib);
	void actualizarLibro(Productos lib);
	List<Productos> elminarLibro(int isbn);
 
}
