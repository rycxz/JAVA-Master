package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Productos;

public interface LibrosRepository extends JpaRepository<Productos, Integer>{

 

}
