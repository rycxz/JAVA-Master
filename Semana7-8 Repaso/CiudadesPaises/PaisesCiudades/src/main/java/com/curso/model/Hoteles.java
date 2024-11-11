package com.curso.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="hoteles")
public class Hoteles {
    @Id
    @Column(name = "id_hotel")
    private int idHoteles;
    private String nombre;
    private String categoria;
    private double precio;
    private boolean disponible;
    
    @ManyToOne
    @JoinColumn(name = "id_hoteles")
    @JsonBackReference
    private Hoteles hoteles;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Hoteles getHoteles() {
		return hoteles;
	}

	public void setHoteles(Hoteles hoteles) {
		this.hoteles = hoteles;
	}

	public Hoteles(String nombre, String categoria, double precio, boolean disponible, Hoteles hoteles) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
		this.hoteles = hoteles;
	}

	public Hoteles() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, disponible, hoteles, idHoteles, nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hoteles other = (Hoteles) obj;
		return Objects.equals(categoria, other.categoria) && disponible == other.disponible
				&& Objects.equals(hoteles, other.hoteles) && idHoteles == other.idHoteles
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
 
    

}
