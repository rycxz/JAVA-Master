package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {
  
	public List<Curso> altaCurso(Curso c);
	public List<Curso> eliminarCurso(int codigo);
	public void actualizarDuracion(int codigo, int duracion);
	public Curso buscarCurso(int codigo);
	public List<Curso> curosPorPrecio(double pracioMin, double precioMax );
	
	

}
