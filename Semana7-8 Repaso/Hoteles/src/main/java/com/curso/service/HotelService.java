package com.curso.service;

import java.util.List;

import com.curso.model.Hoteles;

public interface HotelService {
	List<Hoteles> obtenerHoteles(); 
	 public Hoteles obtenerHotelNombre(String nombreHotel);
}
