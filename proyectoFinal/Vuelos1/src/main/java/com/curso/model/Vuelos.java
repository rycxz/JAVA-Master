package com.curso.model;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * clase que sirve de modelo para viajes 
 * @author Admin
 *
 */
@Entity
@Table(name="vuelos")
public class Vuelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String compañia;
    private Date fechaVuelo;
    private double precio;
    @Column(name="plazas")
    private int plazasDisponibles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public Date getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}
	public void setPlazasDisponibles(int plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}
	public Vuelos(int id, String compañia, Date fechaVuelo, double precio, int plazasDisponibles) {
		super();
		this.id = id;
		this.compañia = compañia;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}
	public Vuelos() {
		super();
	}
    
    

	

    
}
