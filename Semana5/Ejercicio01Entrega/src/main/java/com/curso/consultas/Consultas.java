package com.curso.consultas;

import java.util.List;

import com.curso.model.Pelicula;

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

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
	private EntityManager em;

	private TypedQuery<Pelicula> peli;

	/**
	 * metodo que vuevleve un list con el resultado de la consulta
	 * 
	 * @return
	 */

	
 
 
	public List<Pelicula> mostrarPelicula() {
		em = emf.createEntityManager();
		peli = em.createNamedQuery("mostrarPelicula", Pelicula.class);
		return peli.getResultList();
	}

	/**
	 * metodo que vuevleve un list con el resultado de la consulta
	 * 
	 * @param director = consme
	 * @return
	 */
	public List<Pelicula> directorCosme(String director) {
		em = emf.createEntityManager();
		peli = em.createNamedQuery("directorCosme", Pelicula.class);
		peli.setParameter("director", director);
		return peli.getResultList();
	}

	/**
	 * metodo que vuevleve un list con el resultado de la consulta
	 * 
	 * @param director
	 * @return
	 */
	public List<Pelicula> buscarPorDirectorM(String director) {
		em = emf.createEntityManager();
		peli = em.createNamedQuery("buscarPorDirectorM", Pelicula.class);
		peli.setParameter("director", director);
		return peli.getResultList();
	}
	/**
	 * metodo que se usara para establecer los direcetores de las peliculas 
	 * @param director
	 * @param director2
	 * @return
	 */
	public List<Pelicula> buscarPorDirector(String director, String director2) {
		em = emf.createEntityManager();
		peli = em.createNamedQuery("buscarPorDirector", Pelicula.class);
		peli.setParameter("director", director);
		peli.setParameter("director1", director2);
		return peli.getResultList();
	}
	/**
	 * mostrara solo los directores de las peliculas
	 * @return
	 */
	public List<Pelicula> directoresPeliculas() {
		em = emf.createEntityManager();
		peli = em.createNamedQuery("directoresPeliculas", Pelicula.class);
		return peli.getResultList();
	}
	/**
	 * 
	 * @param d
	 * @param e
	 * @return
	 * metodo que estbalece un rango de precios de los culaes se obtendera la peliculas
	 */
	public List<Pelicula> precioPelicula(double d, double e) {
		em = emf.createEntityManager();
		peli = em.createNamedQuery("precioPelicula", Pelicula.class);
		peli.setParameter("precio_alquiler", d);
		peli.setParameter("precio_alquiler1", e);
		return peli.getResultList();
	}
	/**
	 * muestra cuantas peliculas de cada precio hay
	 * @return
	 */

	public List<Pelicula> peliculasAlquiler() {
		em = emf.createEntityManager();
		peli = em.createNamedQuery("peliculasAlquiler", Pelicula.class);
		return peli.getResultList();
	}

}
