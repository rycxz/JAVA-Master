	
	package com.curso.model;
	import jakarta.persistence.Column;
import jakarta.persistence.Entity;
	import jakarta.persistence.Id;
	import jakarta.persistence.NamedQueries;
	import jakarta.persistence.NamedQuery;
	import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
@NamedQueries({
	@NamedQuery(name="mostrarPerosnas", query="Select p from Persona p"),
	@NamedQuery(name="buscarPorID", query="Select p from Persona p where id = :id"),
	@NamedQuery(name="buscarPorApellido1", query="Select p from Persona p where apellido_uno = :apellido_uno"),
	@NamedQuery(name="buscarPorApellidos", query="Select p from Persona p where apellido_uno = :apellido_uno "
			+ "and apellido_dos = :apellido_dos"),
})


/**
 * 
 * @author Ricardo Sorin Almajan
 * 
 * clase personas que servira para las namedquerys
 *
 */
public class Persona {
				@Id 
		private int  id;
		private String  nombre;
		@Column(name = "apellido_uno")
		private String  apellidoUno;
		@Column(name = "apellido_dos")
		private String  apellidoDos; 
		private String  telefono;
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
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public Persona(int id, String nombre, String apellidoUno, String apellidoDos, String telefono) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellidoUno = apellidoUno;
			this.apellidoDos = apellidoDos;
			this.telefono = telefono;
		}
		@Override
		public String toString() {
			return "Persona [id=" + id + ", nombre=" + nombre + ", apellidoUno=" + apellidoUno + ", apellidoDos="
					+ apellidoDos + ", telefono=" + telefono + "]";
		}
		
		
}
