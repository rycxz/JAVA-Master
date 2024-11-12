package com.curso.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reservas;
import com.curso.service.ReservasService;

@RestController
@RequestMapping("/reservas")
/**
 * clase de controller con varios metodos 
 * @author Ricardo 
 *
 */
public class ReservasController {
	@Autowired
	ReservasService reservasService;
    @PostMapping(value = "/hacerReserva", produces = MediaType.APPLICATION_JSON_VALUE)
    /**
     * metodo que  llama a service  y hace el motodo con un objeto de reservas y da un mensaje de confirmacion 
     * @param reservas
     * @return
     */
    
    public ResponseEntity<String> hacerReserva(@RequestBody  Reservas reservas   ) {
			reservasService.hacerReserva( reservas);
            return ResponseEntity.ok("Reserva realizada correctamente.");
    }

   
   

}

