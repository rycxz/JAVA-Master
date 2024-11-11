package com.curso.model;

public class Pedidos {
	private String nombre;
	private int asignaturas;
	private double precio;
		
	public Pedidos() {
		super();
	}

	public Pedidos(String nombre, int asignaturas, double precio) {
		super();
		this.nombre = nombre;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
}
