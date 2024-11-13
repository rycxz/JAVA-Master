package com.curso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Vuelos;

import jakarta.transaction.Transactional;
/**
 * metodo donde se encuentra las consultas y las querys 
 * @author Admin
 *
 */
public interface VuelosRepository extends JpaRepository<Vuelos, Integer> {

	@Modifying
	@Transactional
	@Query("UPDATE Vuelos v SET v.plazasDisponibles = :plazasDisponibles WHERE v.id = :id AND v.plazasDisponibles >= 0")
	void actualizarVuelos(@Param("id") int idVuelo, @Param("plazasDisponibles") int plazasDisponibles);

	@Query("SELECT v FROM Vuelos v WHERE v.plazasDisponibles >= :plazasDisponibles")
	List<Vuelos> obtenerVuelosConPlazas(@Param("plazasDisponibles") int plazasDisponibles);
	
	
}
