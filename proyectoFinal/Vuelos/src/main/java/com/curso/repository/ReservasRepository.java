package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Reservas;

import jakarta.transaction.Transactional;

public interface ReservasRepository extends JpaRepository<Reservas, Integer> {

	/*
	@Query("SELECT r FROM Reservas r WHERE :nombreHotel like nombreHotel ")
	 public void devolverReservaNombre(String nombreHotel);
	 */
}
