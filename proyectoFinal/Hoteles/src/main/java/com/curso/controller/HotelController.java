package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hoteles;
import com.curso.service.HotelService;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping()
    /**
     * metodo con el get para obtener todos los hoteles
     * @return
     */
    public List<Hoteles> getAllHotels() {
        return hotelService.obtenerHoteles();
    }

   
    /**
     * metodo que obtiene un hotel por el nombre 
     * @param nombrehotel
     * @return
     */
    @GetMapping(value = "/{nombre}" , produces= MediaType.APPLICATION_JSON_VALUE)
    public Hoteles getHotelByName (@PathVariable String nombre) {
        return hotelService.obtenerHotelNombre(nombre);
    }
}

