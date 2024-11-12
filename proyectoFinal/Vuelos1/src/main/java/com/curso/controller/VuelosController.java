package com.curso.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelos;
import com.curso.service.VuelosService;
/**
 * clase donde se estabecen las rutas y se unas los metodos de service 
 * @author ricardo 
 *
 */
@RestController
@RequestMapping("/vuelos")
public class VuelosController {
    @Autowired
    private VuelosService vuelosService;
    /**
     * metodo que obtiene los vuelos diponibles segun las plazas que tenga 
     * @param plazasReserva
     * @return
     */
    @GetMapping(value = "/{plazasReserva}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Vuelos> obtenerVuelosPlazas(@PathVariable int plazasReserva) {
        return vuelosService.obtenerVuelosConPlazas(plazasReserva);
    }
    /**
     * metodo que actualiza u vuelo por su id 
     * @param id
     * @param plazasReserva
     */
    @PutMapping(value = "/{id}/{plazasReserva}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarPlazas (@PathVariable int id,@PathVariable int plazasReserva ) {
    	vuelosService.actualizarVuelos(id, plazasReserva);
    }
    /**
     * metodo que obitiene un vuelo por el id 
     * @param idVuelo
     * @return
     */
    @GetMapping(value = "/{idVuelos}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public Vuelos obtenerVuelo(@PathVariable int idVuelo) {
        return vuelosService.obtenerVuelo(idVuelo);
    }

}

