package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

 
/**
 * 
 * @author Ricardo
 *
 */
public interface CursoService {
	List<Curso> cursos();
	Curso buscarCursos(int codCurso);
	void altaCurso(Curso curs);
	void actualizarCurso(Curso curs);
	List<Curso> eliminarCurso(int codCurso);
	public List<Curso> curosPorPrecio(double pracioMin, double precioMax) ;
 
 
}
