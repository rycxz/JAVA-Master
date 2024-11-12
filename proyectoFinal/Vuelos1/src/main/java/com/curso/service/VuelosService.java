package com.curso.service;

import java.util.List;

import com.curso.model.Vuelos;
/**
 * interfas donde se definen los metodos para el service 
 * @author Ricardo
 *
 */
public interface VuelosService {
	List<Vuelos> obtenerVuelosConPlazas( int plazasReserva); 
	 public void actualizarVuelos(int idVuelo , int plazasReserva);
	 public Vuelos obtenerVuelo(int idVuelo);
}
