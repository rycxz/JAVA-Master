package com.curso.model;

/**
 * 
 * @author Ricardo
 *
 */
public class Curso {
	private int codCurso;
	private String nombre;
	private int duración;
	private double precio;
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuración() {
		return duración;
	}
	public void setDuración(int duración) {
		this.duración = duración;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", duración=" + duración + ", precio=" + precio
				+ "]";
	}
	public Curso() {
		super();
	}
	public Curso(int codCurso, String nombre, int duración, double precio) {
		super();
		this.codCurso = codCurso;
		this.nombre = nombre;
		this.duración = duración;
		this.precio = precio;
	}
	

}
