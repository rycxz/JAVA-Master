package com.curso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
	/*
	@Query("select c form cursos c where c.precio >pracioMin and c.precio<precioMax ")
	public List<Curso> curosPorPrecio(double pracioMin, double precioMax) ;
	*/
	public List<Curso> findByPrecioBetween(double pracioMin, double precioMax) ;
 
	
	
}