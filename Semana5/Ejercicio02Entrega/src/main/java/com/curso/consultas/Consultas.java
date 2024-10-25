package com.curso.consultas;

import java.util.List;

import com.curso.model.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * 
 * @author Ricardo 
 * clase donde se guarda los metodos de nas named query
 *
 */
public class Consultas {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("personas");
	private EntityManager em;

	private TypedQuery<Persona> persona;

	/**
	 * metodo que vuevleve un list con el resultado de la consulta
	 * 
	 * @return
	 */
 
	public List<Persona> mostrarPerosnas() {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("mostrarPerosnas", Persona.class);
		return persona.getResultList();
	}

	/**
	 * metodo que vuevleve un list con el resultado de la consulta
	 * 
	 * @param id 
	 * @return
	 */
	public List<Persona> buscarPorID(int id) {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("buscarPorID", Persona.class);
		persona.setParameter("id", id);
		return persona.getResultList();
	}

	/**
	 * metodo que vuevleve un list con el resultado de la consulta
	 * 
	 * @param apellidoUno
	 * @return
	 */
	public List<Persona> buscarPorApellido1(String apellidoUno) {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("buscarPorApellido1", Persona.class);
		persona.setParameter("apellido_uno", apellidoUno);
		return persona.getResultList();
	}
	/**
	 * metodo que muestra las perosnas por sus dos aplleidos 
	 * @param apellidoUno
	 * @param apellidoDos
	 * @return
	 */
	List<Persona> buscarPorApellidos(String apellidoUno, String apellidoDos) {
		em = emf.createEntityManager();
		persona = em.createNamedQuery("buscarPorApellidos", Persona.class);
		persona.setParameter("apellido_uno", apellidoUno);
		persona.setParameter("apellido_dos", apellidoDos);
		return persona.getResultList();
	}
}
