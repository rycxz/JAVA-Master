package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Hoteles;
import com.curso.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements CiudadService{
    @Autowired
    private CiudadRepository cityRepository;

    public List<Hoteles> getAllCities() {
        return cityRepository.findAll();
    }

    public Hoteles createCity(Hoteles city) {
        return cityRepository.save(city);
    }
}
