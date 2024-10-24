package com.curso.crud;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Persist02Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("bibloteca");
		EntityManager em = emf.createEntityManager();
		
		Libro lib = new Libro("123-456-789" , "Solo hiking" , "Pepito" , "15");
		em.getTransaction().begin();
		em.persist(lib);
		em.getTransaction().commit();


	}

}
