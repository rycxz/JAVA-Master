package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Hoteles;
import com.curso.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelRepository hotelRepository;


	public List<Hoteles> obtenerHoteles() {
				return hotelRepository.obtenerHotel();
	}
	

	public Hoteles obtenerHotelNombre( String nombreHotel) {
		return hotelRepository.obtenerHotelNombre(nombreHotel);
	}
 

}
