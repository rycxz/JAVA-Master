package com.curso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Hoteles;

public interface HotelRepository extends JpaRepository<Hoteles, Integer> {
	@Query("select h from Hoteles h where h.disponible = true ")
	public   List<Hoteles> obtenerHotel  ();
	@Query("select h from Hoteles h where h.nombre = :nombre")
	public Hoteles obtenerHotelNombre(@Param("nombre") String nombre);
		 
}
