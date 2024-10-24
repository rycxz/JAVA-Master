package com.curso.crud;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Remove03 {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("bibloteca");
		EntityManager em = emf.createEntityManager();
		
		Libro lib = em.find(Libro.class, "123-456-789");
		em.getTransaction().begin();
	 em.remove(lib);
		em.getTransaction().commit();

	}

}
