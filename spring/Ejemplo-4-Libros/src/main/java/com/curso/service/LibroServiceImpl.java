package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;
/**
 * 
 * @author Ricardo
 *
 */
@Service
public class LibroServiceImpl implements LibroService{
		
		public List<Libro> libros;
		public Libro lib;
		
		/**
		 * incializo un contctor
		 */
		public LibroServiceImpl() {
			libros=new ArrayList<>(List.of(new Libro(1,"Grecia","guia turistica"),
											new Libro(2,"Dracula","suspense"),
											new Libro(3,"El diario","novela")));
			}
		/**
		 * devuevlo array de libros
		 */
	@Override
	public List<Libro> libros() {
		return libros;
	}
	 
	@Override
	/**
	 * busco un libro con comprobaciones  y lo devuelvo
	 */
	public Libro buscarLibro(int isbn) {
		 for(Libro l : libros) {
			 if(l != null && l.getIsbn() == isbn) {
				 return l;
			 }
		 }
		return null;
	}
	/**
	 * doy de alta un libro y lo añado al array
	 */
	@Override
	public void altaLibro(Libro lib) {
		libros.add(lib);
		 
		
	}
	/**
	 * cambio un libro previamente buscandolo
	 */
	@Override
	public void actualizarLibro(Libro lib) {
		 Libro l = buscarLibro(lib.getIsbn());
				l.setTematica(lib.getTematica());
				l.setTitulo(lib.getTitulo());	
	}
	/**
	 * eliminamos un libro por el isbn 
	 */
	@Override
	public List<Libro> eliminarLibro(int isbn) {
		Libro l = buscarLibro( isbn);
				 libros.remove(l);
			 
		return libros;
	}

}
