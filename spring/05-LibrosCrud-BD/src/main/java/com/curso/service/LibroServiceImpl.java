package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Libro;
import com.curso.repository.LibrosRepository;
@Service
public class LibroServiceImpl implements LibroService {
	@Autowired
		LibrosRepository repository;
	 
	 
	@Override
	public List<Libro> libros() {
		 
		return repository.findAll();
	}

	@Override
	public Libro buscarLibro(int isbn) {
		  
		return repository.findById(isbn).orElse(null);
	}

	@Override
	public void altaLibro(Libro lib) {
		repository.save(lib);

	}

	@Override
	public void actualizarLibro(Libro lib) {
		repository.save(lib);

	}

	@Override
	public List<Libro> elminarLibro(int isbn) { 
				repository.delete(null);
				return repository.findAll();
	}

}
