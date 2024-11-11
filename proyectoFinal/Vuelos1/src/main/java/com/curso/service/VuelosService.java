package com.curso.service;

import java.util.List;

import com.curso.model.Vuelos;

public interface VuelosService {
	List<Vuelos> obtenerVuelosConPlazas( int plazasReserva); 
	 public void actualizarVuelos(int idVuelo , int plazasReserva);
}
