package com.curso.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas")
public class Reservas {
    @Id
    @Column(name = "id_reservas")
    private int idReservas;
    private String nombreCliente;
    private String dni;

    @ManyToOne
    @JoinColumn(name = "id_hotel")
    @JsonBackReference
    private int idHotel;
    @ManyToOne
    @JoinColumn(name = "id_vuelos")
    @JsonBackReference
    private int idVuelos;
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
	public int getIdVuelos() {
		return idVuelos;
	}
	public void setIdVuelos(int idVuelos) {
		this.idVuelos = idVuelos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, idHotel, idVuelos, nombreCliente);
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
		return Objects.equals(dni, other.dni) && idHotel == other.idHotel && idVuelos == other.idVuelos
				&& Objects.equals(nombreCliente, other.nombreCliente);
	}
	public Reservas(String nombreCliente, String dni, int idHotel, int idVuelos) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idHotel = idHotel;
		this.idVuelos = idVuelos;
	}
	public Reservas() {
		super();
	}
 
    
	
}
