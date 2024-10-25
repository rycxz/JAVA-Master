package com.curso.crud;

import java.util.List;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class BuscarTodoNamedQuerys {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("bibloteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Libro> consulta =em.createNamedQuery("BuscarTodo",Libro.class);
		
		List<Libro> libros = consulta.getResultList();
		for(Libro lib : libros) {
			System.out.println(lib.toString());
		}
		
		
		
		
		
	}

}
