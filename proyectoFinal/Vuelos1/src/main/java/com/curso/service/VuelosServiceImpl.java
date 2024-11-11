package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Vuelos;
import com.curso.repository.VuelosRepository;

@Service
public class VuelosServiceImpl implements VuelosService{
    @Autowired
    private VuelosRepository vuelosRespository;


	public List<Vuelos> obtenerVuelosConPlazas(int plazasReserva) {
		 
		return vuelosRespository.obtenerVuelosConPlazas(plazasReserva);
	}


	public void actualizarVuelos(int idVuelo, int plazasReserva) {
		vuelosRespository.actualizarVuelos(idVuelo, plazasReserva);
		
	}


}
