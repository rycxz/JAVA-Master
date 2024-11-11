package com.curso.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="paises")
public class Vuelos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "pais")
    @JsonManagedReference
    private List<Hoteles> ciudades;

   	public Vuelos() {
		super();
	}

	public Vuelos(Long id) {
		super();
		this.id = id;
	}

	public Vuelos(Long id, String nombre, List<Hoteles> ciudades) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudades = ciudades;
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Hoteles> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<Hoteles> ciudades) {
		this.ciudades = ciudades;
	}

    }

