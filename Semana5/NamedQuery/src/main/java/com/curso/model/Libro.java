package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
	@Entity
	@Table(name = "libros")
	@NamedQueries({
		@NamedQuery(name="BuscarTodo", query="Select l from Libro l"),
		@NamedQuery(name="BuscarPorIsbn", query="Select l from Libro l where isbn = :isbn"),
		@NamedQuery(name="BuscarPorAutor", query="Select l from Libro l where autor = :autor"),
		@NamedQuery(name="BuscarPortitulo", query="Select l from Libro l where titulo = :titulo")
		
		
	})
public class Libro {
	

			@Id 
	private String  isbn;
	private String  titulo;
	private String  autor;
	private String  precio;
	public Libro() {
		super();
	}
	public Libro(String isbn, String titulo, String autor, String precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
}
