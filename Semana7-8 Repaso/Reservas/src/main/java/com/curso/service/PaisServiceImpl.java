package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Vuelos;
import com.curso.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{
	@Autowired
	private PaisRepository countryRepository;

	public List<Vuelos> getAllCountries() {
		return countryRepository.findAll();
	}

	public Vuelos createCountry(Vuelos country) {
		return countryRepository.save(country);
	}

}
