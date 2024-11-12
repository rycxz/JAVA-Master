package com.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Reservas;
import com.curso.model.Vuelos;
import com.curso.repository.ReservasRepository;
/**
 * clase service donde se  implementan los metodos de la interfaz  y se definen 
 * @author Ricardo 
 *
 */
@Service
public class ReservasServiceImpl implements ReservasService{
    @Autowired
    private ReservasRepository reservasRespository;
    @Autowired 
    RestTemplate restTemplate;
    //creamos el repositroy y el template 
    private final String URL_MICROSERVICIO_VUELO = "http://localhost:8080";
	@Override
	/**
	 * metodo que busca guarda una reserva obptiene un vuelo y actualiza las plazas que tiene 
	 * @param reserva que es un objeto de reserva donde despues se le separan los datos 
	 */
	 
	public void hacerReserva(Reservas reserva) {
		int idVuelo = reserva.getIdVuelo();
		 int idHotel = reserva.getIdHotel();
		String nombre = reserva.getNombreCliente(); 
		String dni = reserva.getDni(); 
		int totalPersonas = reserva.getNumeroPersonas();
		if (totalPersonas > 0) {
	        //guardo la reserva
	        reservasRespository.save(new Reservas(nombre, dni, totalPersonas, idHotel, idVuelo));
	        
	        //   verificar las plazas disponibles 
	        String urlDisponibilidad = URL_MICROSERVICIO_VUELO.concat("/vuelos/{idVuelo}");
	       Vuelos vuelo = restTemplate.getForObject(urlDisponibilidad, Vuelos.class, idVuelo);
	       int plazasDisponibles = vuelo.getPlazasDisponibles();
	        
	        if (plazasDisponibles >= totalPersonas) {
	            // actualizamos las plaazas de vuelos 
	            String urlActualizar = URL_MICROSERVICIO_VUELO.concat("/vuelos/{idVuelo}/{plazasDisponibles}");
	            //le pongo el numero actualizado de reservas
	            restTemplate.put(urlActualizar, null, idVuelo, plazasDisponibles-totalPersonas);  
	           // lo de null es por que solo es un dato si hicese falta mas se le podira añadir
	        } else {
	           //si da erro decir por que 
	            throw new IllegalStateException("No hay suficientes plazas disponibles en el vuelo.");
	        }
	    } else {
	        throw new IllegalArgumentException("El número de personas debe ser mayor que cero.");
	    }
	}
	@Override
	public void devolverReservaNombre(String nombreHotel) {
		 
		
	}



	 


}
