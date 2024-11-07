package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionService;

 
 
@RestController
public class FormacionController {
	@Autowired
	
	FormacionService formacionService;
	
	 
	@PostMapping(value="formacion/{curso}/{asignaturas}/{precio}")
	public List<Formacion> altaFormacion(String curso, int asignaturas, double precio) {
		Formacion formacon = new Formacion(curso, asignaturas*10, precio);
		return formacionService.nuevaFormacion(formacon);
	
}
	}
