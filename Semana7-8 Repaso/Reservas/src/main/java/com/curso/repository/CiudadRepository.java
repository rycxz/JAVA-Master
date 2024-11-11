package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Hoteles;

public interface CiudadRepository extends JpaRepository<Hoteles, Long> {

}
