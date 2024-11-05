package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;

import com.curso.service.CursoService;

@RestController
public class CursoController {
	@Autowired
	private CursoService cursosService;
	@GetMapping(value = "cursos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> cursos() {
		return cursosService.cursos();
	}
	@GetMapping(value = "cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	Curso buscarCursos(int codCurso) {
		return cursosService.buscarCursos(codCurso);
		
	}
	@PostMapping(value="cursos/{codCurso}",consumes=MediaType.APPLICATION_JSON_VALUE)
	void altaCurso(Curso curs) {
		cursosService.altaCurso(curs);
	}
	@PostMapping(value="cursos",consumes=MediaType.APPLICATION_JSON_VALUE)
	void actualizarCurso(Curso curs) {
		cursosService.actualizarCurso(curs);
	}
	@DeleteMapping(value="cursos/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
	List<Curso> eliminarCurso(int codCurso){
		return cursosService.eliminarCurso(codCurso);
	}
}
