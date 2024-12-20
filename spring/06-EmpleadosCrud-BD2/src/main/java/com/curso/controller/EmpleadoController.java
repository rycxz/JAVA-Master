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

import com.curso.model.Empleado;
import com.curso.service.EmpleadoService;

import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name = "Empleados", description = " la Api de los empleados")
@RestController
public class EmpleadoController {
	@Autowired
	EmpleadoService empleadosService;
	
	@Operation(summary = "Buscar  los empleados ", description = "Devolvemos todos los empleados", responses = { 
			@ApiResponse(responseCode = "201", description = "Libro creado con éxito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: el libro ya existe")
			})

	@GetMapping(value = "empleados", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> empleados() {
		return empleadosService.empleados();
	}
	@GetMapping(value = "empleados/{idEmpleado}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Empleado buscarLibros(@PathVariable int idEmpleado ) {
		return empleadosService.buscarEmpleado(idEmpleado);
	}
	@PostMapping(value="empleados",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void agregar(@RequestBody Empleado l) {
		 empleadosService.altaEmpleado(l);;
	}
	@PostMapping(value="empleados",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@RequestBody Empleado l) {
		 empleadosService.actualizarEmpleados(l);;
	}
	@DeleteMapping(value="empleados/{idEmpleado}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> eliminar(@PathVariable int idEmpleado) {
		  
		return empleadosService.eliminarEmpleado(idEmpleado);
	}
	
}
