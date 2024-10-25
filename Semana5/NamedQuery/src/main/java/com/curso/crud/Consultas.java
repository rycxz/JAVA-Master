package com.curso.crud;

import java.util.List;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Consultas {

	
		
	private EntityManagerFactory emf =Persistence.createEntityManagerFactory("bibloteca");
	private EntityManager em ;
		
		 private TypedQuery<Libro> libro ; 
		 
		 
		 

	
	 public List<Libro>buscarLibro(){
		 em = emf.createEntityManager();
		 libro = em.createQuery("BuscarTodo",Libro.class);
		 return libro.getResultList();
	 }
	 
	 public List<Libro>buscarPorAutor(String autor){
		 em = emf.createEntityManager();
		 libro = em.createQuery("BuscarPorAutor",Libro.class);
		 libro.setParameter("autor", autor);
		 return libro.getResultList();
	 }
	 public List<Libro>buscarPorISBN(String isbn){
		 em = emf.createEntityManager();
		 libro = em.createQuery("BuscarPorIsbn",Libro.class);
		 libro.setParameter("isbn", isbn);
		 return libro.getResultList();
	 }
	 public List<Libro>buscarPorTitulo(String titulo){
		 em = emf.createEntityManager();
		 libro = em.createQuery("BuscarPortitulo",Libro.class);
		 libro.setParameter("titulo", titulo);
		 return libro.getResultList();
	 }
 
}
