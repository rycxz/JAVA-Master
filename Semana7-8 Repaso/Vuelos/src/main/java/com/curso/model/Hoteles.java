package com.curso.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ciudades")
public class Hoteles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    @JsonBackReference
    private Vuelos pais;

	public Hoteles() {
		super();
	}

	public Hoteles(Long id) {
		super();
		this.id = id;
	}

	public Hoteles(String nombre, Vuelos pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	public Hoteles(Long id, String nombre, Vuelos pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}

	public Vuelos getPais() {
		return pais;
	}

	public void setPais(Vuelos pais) {
		this.pais = pais;
	}       

}
