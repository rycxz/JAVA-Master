package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Estudiante;

public interface EstudianteRepository  extends JpaRepository<Estudiante, Long> {
}