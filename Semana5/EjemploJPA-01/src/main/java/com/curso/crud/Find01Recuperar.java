package com.curso.crud;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Find01Recuperar {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("bibloteca");
		EntityManager em = emf.createEntityManager();
		
		
		Libro lib = em.find(Libro.class, "978-3-16-148410-0");
		
		if(lib != null) {
			System.out.println(lib.toString());
		}
		
		
		
		
	}

}
