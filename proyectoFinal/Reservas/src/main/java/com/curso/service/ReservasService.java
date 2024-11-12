package com.curso.service;

import com.curso.model.Reservas;
/**
 * Intefaz para los metodos  de service 
 * @author Admin
 *
 */
public interface ReservasService {
	 public void hacerReserva(Reservas reserva);
	 public void devolverReservaNombre(String nombreHotel);
	 
}
