package com.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Reservas;
import com.curso.repository.ReservasRepository;

@Service
public class ReservasServiceImpl implements ReservasService{
    @Autowired
    private ReservasRepository vuelosRespository;

	@Override
	public void hacerReserva(int idVuelo, int idHotel, String nombre, String dni, int totalPersonas) {
		if(totalPersonas<=0) {
			vuelosRespository.save(new Reservas(  nombre,  dni,  idHotel,  idVuelo));
		}
		
	 
		
	}

	@Override
	public void devolverReservaNombre(String nombreHotel) {
		 
		
	}


	 


}
