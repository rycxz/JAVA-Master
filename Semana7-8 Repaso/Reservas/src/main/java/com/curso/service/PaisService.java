package com.curso.service;

import java.util.List;

import com.curso.model.Vuelos;

public interface PaisService {
	List<Vuelos> getAllCountries();
	Vuelos createCountry(Vuelos country);
}
