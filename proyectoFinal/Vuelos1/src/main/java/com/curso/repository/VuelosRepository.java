package com.curso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Vuelos;

import jakarta.transaction.Transactional;

public interface VuelosRepository extends JpaRepository<Vuelos, Integer> {

	@Modifying
	@Transactional
	@Query("UPDATE Vuelos v SET v.plazasDisponibles = :plazas WHERE v.id = :id AND v.plazasDisponibles >= 0")
	void actualizarVuelos(@Param("id") int idVuelo, @Param("plazas") int plazasReserva);

	@Query("SELECT v FROM Vuelos v WHERE v.plazasDisponibles >= :plazas")
	List<Vuelos> obtenerVuelosConPlazas(@Param("plazas") int plazasReserva);
	
	
}
