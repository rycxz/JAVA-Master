package com.curso.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Curso;
import com.curso.repository.CursoRepository;
 
 
@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
		CursoRepository repository;

	@Override
	public List<Curso> cursos() {
		return repository.findAll();
	}

	@Override
	public Curso buscarCursos(int codCurso) {
		 
		return repository.findById(codCurso).orElse(null);
	}

	@Override
	public void altaCurso(Curso curs) {
		repository.save(curs);
		
	}

	@Override
	public void actualizarCurso(Curso curs) {
		repository.save(curs);
		
	}

	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		repository.deleteById(codCurso);
		return repository.findAll();
	}

	@Override
	public List<Curso> curosPorPrecio(double pracioMin, double precioMax) {
		 
		return repository.findByPrecioBetween(pracioMin, precioMax);
	}

 
 
	 
	 
	
}
