package com.curso.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Empleado;
import com.curso.repository.EmpleadoRepository;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
		EmpleadoRepository repository;
	 
	 
	@Override
	public List<Empleado> empleados() {
		 
		return repository.findAll();
	}

	@Override
	public Empleado buscarEmpleado(int idEmpleado) {
		  
		return repository.findById(idEmpleado).orElse(null);
	}

	@Override
	public void altaEmpleado(Empleado emp) {
		repository.save(emp);

	}

	@Override
	public void actualizarEmpleados(Empleado emp) {
		repository.save(emp);

	}

	@Override
	public List<Empleado> eliminarEmpleado(int idEmpleado) { 
				repository.deleteById(idEmpleado);
				return repository.findAll();
	}


	 
 
	 

}
