package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/hotel")
    public List<Hoteles> getAllHotels() {
        return hotelService.obtenerHoteles();
    }

    @GetMapping(value = "/{nombreHotel}")
    public Hoteles getHotelByName (@PathVariable String nombrehotel) {
        return hotelService.obtenerHotelNombre(nombrehotel);
    }
}

