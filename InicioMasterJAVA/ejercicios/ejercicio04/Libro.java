package ejercicio04;

import java.io.Serializable;

public class Libro implements Serializable,Comparable<Libro>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*Crear una clase Libro que contenga los siguientes atributos: 
– ISBN 
– Titulo 
– Autor 
– Número de páginas 
Crear sus métodos get y set correspondientes para cada atributo. (getter y 
setter) 
 Crear el método toString() para mostrar la información relativa al libro con el 
siguiente formato: 
“El libro con isbn ISBN  escrito por el autor XXX tiene YYY páginas” 
En el fichero main, crear 2 objetos Libro (los valores que se quieran) y 
mostrarlos por pantalla. 
Por último, indicar cuál de los 2 tiene más páginas. */
	public String isbn;
	public String titulo;
	public String autor;
	public int numeroPaginas;
	
	//creacion de los setter y getters
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
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numero_paginas) {
		this.numeroPaginas = numero_paginas;
	}
	@Override
	public String toString() {
		return "“El libro con isbn"+isbn+"  escrito por el autor"+autor+" tiene "+autor+" páginas” \r\n";
	}
	//creacion del colstructor
	public Libro(String isbn, String titulo, String autor, int numero_paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numero_paginas;
	}
	public Libro() {
		super();
	}
	@Override
	public int compareTo(Libro o) {
		if(o.getNumeroPaginas()>getNumeroPaginas()) {
			return 0;
		}
		else {
		 
		return 1;
		}
	}
 
	
}
