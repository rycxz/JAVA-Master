package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * @author Ricardo
 *
 */
@Entity
@Table(name="empleados")
public class Empleado   {
	@Id
	private int idEmpleado;
	private String nombre;
	private String apellido;
	private String email;
	
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Empleado(int idEmpleado, String nombre, String apellido, String email) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	public Empleado() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, email, idEmpleado, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(email, other.email)
				&& idEmpleado == other.idEmpleado && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	

}
