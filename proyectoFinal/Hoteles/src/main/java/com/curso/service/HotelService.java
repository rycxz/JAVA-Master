package com.curso.service;

import java.util.List;

import com.curso.model.Hoteles;

/**
 * Interfaz para la implementacion de los metodos 
 * @author Ricardo
 *
 */
public interface HotelService {
	List<Hoteles> obtenerHoteles(); 
	 public Hoteles obtenerHotelNombre(String nombreHotel);
}
