package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Vuelos;
import com.curso.repository.VuelosRepository;
/**
 * clase service donde meiante el uso de las querys  hace las distinas funcionalidades del enunciado 
 * @author Admin
 *
 */
@Service
public class VuelosServiceImpl implements VuelosService{
    @Autowired
    private VuelosRepository vuelosRespository;

/**
 * metodo que obtiene un vuelo con plazas 
 */
	public List<Vuelos> obtenerVuelosConPlazas(int plazasReserva) {
		 
		return vuelosRespository.obtenerVuelosConPlazas(plazasReserva);
	}

/**
 * metodo que actualizas los vuelos con dos paramteros que recibe 
 */
	public void actualizarVuelos(int idVuelo, int plazasReserva) {
		vuelosRespository.actualizarVuelos(idVuelo, plazasReserva);
		
	}


	@Override
	/**
	 * metodo qe obtiene un solo vuelo con su id 
	 */
	public Vuelos obtenerVuelo(int idVuelo) {
		 
		return vuelosRespository.findById(idVuelo).orElse(null);
	}


}
