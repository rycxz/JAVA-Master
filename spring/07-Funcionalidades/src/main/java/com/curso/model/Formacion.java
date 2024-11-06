package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Formacion {
	@Id
	private String curso ;
	private int asignaturas;
	private double precio;
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Formacion(String curso, int asignaturas, double precio) {
		super();
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}
	public Formacion() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(asignaturas, curso, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formacion other = (Formacion) obj;
		return asignaturas == other.asignaturas && Objects.equals(curso, other.curso)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
}
