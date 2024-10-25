package com.curso.crud;

import com.curso.model.Libro;

public class VerConsultas {

	public static void main(String[] args) {
		Consultas c = new Consultas();
		
		System.out.println("muestro todos los libros ");
		for(Libro l : c.buscarLibro()) {
			System.out.println(l.toString());
		}
		System.out.println("muestro todos los libros por isbn  ");
		for(Libro l : c.buscarPorISBN("978-3-16-148410-0")) {
			System.out.println(l.toString());
		}
		System.out.println("muestro todos los libros por autor ");
		for(Libro l : c.buscarPorAutor("Gabriel García Márquez")) {
			System.out.println(l.toString());
		}
		System.out.println("muestro todos los libros titulo ");
		for(Libro l : c.buscarPorTitulo("Cien años de soledad")) {
			System.out.println(l.toString());
		}
		

	}

}
