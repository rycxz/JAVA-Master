package com.curso.service;

 

public interface ReservasService {
	 public void hacerReserva(int idVuelo,int idHotel,String nombre,
			 String dni ,int totalPersonas);
	 public void devolverReservaNombre(String nombreHotel);
	 
}
