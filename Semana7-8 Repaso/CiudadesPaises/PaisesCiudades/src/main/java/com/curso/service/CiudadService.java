package com.curso.service;

import java.util.List;

import com.curso.model.Hoteles;

public interface CiudadService {
	List<Hoteles> getAllCities(); 
	Hoteles createCity(Hoteles city);
}
