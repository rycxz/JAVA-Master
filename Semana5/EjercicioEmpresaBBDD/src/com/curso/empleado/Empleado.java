package com.curso.empleado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
	private int id;
	private String nombre;
	private	String apellidoUno;
	private String apellidoDos;
	private LocalDate fechaNacimiento;
	private int salario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoUno() {
		return apellidoUno;
	}
	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}
	public String getApellidoDos() {
		return apellidoDos;
	}
	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Empleado(int id, String nombre, String apellidoUno, String apellidoDos, String  fechaNacimiento,
			int salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fecha = LocalDate.parse( fechaNacimiento, formato);	
		this.fechaNacimiento = fecha;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidoUno=" + apellidoUno + ", apellidoDos="
				+ apellidoDos + ", fechaNacimiento=" + fechaNacimiento + ", salario=" + salario + "]";
	}
	

}
