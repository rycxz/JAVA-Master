package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Vuelos;

public interface PaisRepository extends JpaRepository<Vuelos, Long> {

}
