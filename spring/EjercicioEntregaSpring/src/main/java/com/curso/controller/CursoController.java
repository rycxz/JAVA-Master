package com.curso.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;

import com.curso.service.CursoServiceImpl;

@RestController
public class CursoController {
	@Autowired
	private CursoServiceImpl cursoServ;

	@PostMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaCurso(@RequestBody Curso curso) {
		cursoServ.altaCurso(curso);
	}
	@DeleteMapping(value = "cursos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> eliminarCurso(@RequestBody int codigo) {
		return cursoServ.eliminarCurso(codigo);

	}
	@PutMapping(value = "cursos/{codigo}/{duracion}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarDuracionCurso(@RequestBody int codigo , @RequestBody int duracion) {
		cursoServ.actualizarDuracion(codigo, duracion);
	}
	@GetMapping(value = "cursos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso buscarLibro(@PathVariable int codigo) {
		return cursoServ.buscarCurso(codigo);
	}

	@GetMapping(value = "cursos/{precioMin}/{precioMax}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> buscarCursosPrecio(@PathVariable int precioMin ,@PathVariable int precioMax) {
		return cursoServ.curosPorPrecio(precioMin, precioMax);
	}

 

 

	 
}
