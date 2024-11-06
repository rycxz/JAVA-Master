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

 @Tag(name = "empleados" , description = "La api de los empleados")
@RestController
public class EmpleadoController {
	@Autowired
	EmpleadoService empleadosService;
	@Operation(summary = "Devolver todos los empeados ", description = "Buscar todos los empleados", responses = { 
			@ApiResponse(responseCode = "201", description = "Empleados devueltos con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: los empleados no se han podidio recuperar")
			})

	@GetMapping(value = "empleados", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> empleados() {
		return empleadosService.empleados();
	}
	@Operation(summary = "Devolver   el empleado por el id ", description = "     buscar el  empleado por id", responses = { 
			@ApiResponse(responseCode = "201", description = "Empleado devuelto  con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: los empleados no se han podidio recuperar")
			})
	@GetMapping(value = "empleados/{idEmpleado}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Empleado buscarLibros(@PathVariable int idEmpleado ) {
		return empleadosService.buscarEmpleado(idEmpleado);
	}
	@Operation(summary = "agregar un empleado ", description = "agregar un empleado a la base ", responses = { 
			@ApiResponse(responseCode = "201", description = "Empleado agregado con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: los empleados no se han podidio recuperar")
			})
	@PostMapping(value="empleados",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void agregar(@RequestBody Empleado l) {
		 empleadosService.altaEmpleado(l);;
	}
	@Operation(summary = "actualizar un empleado ", description = "actualizar un empleado a la base ", responses = { 
			@ApiResponse(responseCode = "201", description = "Empleado actualizar con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: los empleados no se han podidio recuperar")
			})
	@PostMapping(value="empleados",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@RequestBody Empleado l) {
		 empleadosService.actualizarEmpleados(l);;
	}
	@Operation(summary = "eliminar  un empleado ", description = "eliminar un empleado a la base ", responses = { 
			@ApiResponse(responseCode = "201", description = "Empleado eliminar con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: los empleados no se han podidio recuperar")
			})
	@DeleteMapping(value="empleados/{idEmpleado}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Empleado> eliminar(@PathVariable int idEmpleado) {
		  
		return empleadosService.eliminarEmpleado(idEmpleado);
	}
	
}
