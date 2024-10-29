package com.curso.model;

import java.util.Objects;

/**
 * 
 * @author Ricardo
 *
 */

public class Libro   {
	private int isbn;
	private String titulo;
	private String tematica;
	
	
	
	
	public int getIsbn() {
		return isbn;
	}




	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getTematica() {
		return tematica;
	}




	public void setTematica(String tematica) {
		this.tematica = tematica;
	}




	@Override
	public int hashCode() {
		return Objects.hash(isbn, tematica, titulo);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn && Objects.equals(tematica, other.tematica) && Objects.equals(titulo, other.titulo);
	}




	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
	}




	public Libro() {
		super();
	}




	public Libro(int isbn, String titulo, String tematica) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}




 
	

}
