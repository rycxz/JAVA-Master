package com.curso.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * clase de reservas para todos los metodos 
 * @author ricardo 
 *
 */
@Entity
@Table(name="reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_cliente")
    private String nombreCliente;
    private String dni;
    private int numeroPersonas;
    @Column(name = "id_hoteles")
    private int idHotel;
    @Column(name = "id_vuelos")
    private int idVuelo;
    @Column(name = "cantidad_personas")
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	public int getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	public int getNumeroPersonas() {
		return numeroPersonas;
	}
	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}
	public Reservas(String nombreCliente, String dni,int numeroPersonas, int idHotel, int idVuelo) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.numeroPersonas = numeroPersonas;
		this.idHotel = idHotel;
		this.idVuelo = idVuelo;
	 
	}
	public Reservas() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, id, idHotel, idVuelo, nombreCliente, numeroPersonas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservas other = (Reservas) obj;
		return Objects.equals(dni, other.dni) && id == other.id && idHotel == other.idHotel && idVuelo == other.idVuelo
				&& Objects.equals(nombreCliente, other.nombreCliente) && numeroPersonas == other.numeroPersonas;
	}    
}
