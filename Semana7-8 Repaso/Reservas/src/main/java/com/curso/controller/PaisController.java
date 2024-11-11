package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelos;
import com.curso.service.PaisService;

@RestController
@RequestMapping("/api/countries")
public class PaisController {
	
    @Autowired
    private PaisService countryService;

    @GetMapping
    public List<Vuelos> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public Vuelos createCountry(@RequestBody Vuelos country) {
        return countryService.createCountry(country);
    }

}
