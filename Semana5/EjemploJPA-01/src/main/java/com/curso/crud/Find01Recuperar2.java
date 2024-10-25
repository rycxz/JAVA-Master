package com.curso.crud;

import java.util.List;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Find01Recuperar2 {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("bibloteca");
		EntityManager em = emf.createEntityManager();
		
		
		TypedQuery<Libro> consulta = em.createQuery("select l from libros l   "
				+ "where l.autor = :autor  and l.isbn = :isbn",Libro.class);
		
		consulta.setParameter("autor", "F. Scott Fitzgerald");
		consulta.setParameter("isbn", "978-0-7432-7357-2");
		Libro lib = (Libro) consulta.getResultList();
		
		if(lib != null) {
			System.out.println(lib.toString());
		}
		
		 
 		
		
	}

}
