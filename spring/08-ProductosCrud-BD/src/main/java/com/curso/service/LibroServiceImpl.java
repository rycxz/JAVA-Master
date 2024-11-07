package com.curso.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Productos;
import com.curso.repository.LibrosRepository;
@Service
public class LibroServiceImpl implements LibroService {
	@Autowired
		LibrosRepository repository;
	 
	 
	@Override
	public List<Productos> productos() {
		 
		return repository.findAll();
	}

	@Override
	public Productos buscarLibro(int isbn) {
		  
		return repository.findById(isbn).orElse(null);
	}

	@Override
	public void altaLibro(Productos lib) {
		repository.save(lib);

	}

	@Override
	public void actualizarLibro(Productos lib) {
		repository.save(lib);

	}

	@Override
	public List<Productos> elminarLibro(int isbn) { 
				repository.deleteById(isbn);
				return repository.findAll();
	}

	 

}
