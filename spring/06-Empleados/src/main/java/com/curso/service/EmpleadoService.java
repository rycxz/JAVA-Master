package com.curso.service;

import java.util.List;

import com.curso.model.Empleado;


/**
 * 
 * @author Ricardo
 *
 */

public interface EmpleadoService {
	List<Empleado> empleados();
	Empleado buscarEmpleado(int idEmpleado);
	void altaEmpleado(Empleado emp);
	void actualizarEmpleados(Empleado emp);
	List<Empleado> eliminarEmpleado(int idEmpleado);
 
}
