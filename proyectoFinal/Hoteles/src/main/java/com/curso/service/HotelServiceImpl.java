package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Hoteles;
import com.curso.repository.HotelRepository;
/**
 * clase donde se implementas las querys 
 * @author Ricardo 
 *
 */
@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelRepository hotelRepository;

/**
 * metodo que deminate la query obtiene los hoteles 
 */
	public List<Hoteles> obtenerHoteles() {
				return hotelRepository.obtenerHotel();
	}
	/**
	 * metodo que obtiene mediante la query un hotel por su nombre
	 */

	public Hoteles obtenerHotelNombre( String nombreHotel) {
		return hotelRepository.obtenerHotelNombre(nombreHotel);
	}
 

}
