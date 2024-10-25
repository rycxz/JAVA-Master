package com.curso.consultas;

import com.curso.model.Pelicula;

public class VerConsultas {

	public static void main(String[] args) {
		Consultas c = new Consultas();

		System.out.println("muestro todos los mostrarPelicula ");
		for(Pelicula p : c.mostrarPelicula()) {
			System.out.println(p);
		}
		System.out.println("directorCosme");
		for(Pelicula p : c.directorCosme("George Miller")) {
			System.out.println(p.toString());
		}
		System.out.println("buscarPorDirectorM  ");
		for(Pelicula p : c.buscarPorDirectorM("M%")) {
			System.out.println(p.toString());
		}
		System.out.println("buscarPorDirector  ");
		for(Pelicula p : c.buscarPorDirector("Ana","Eva")) {
			System.out.println(p.toString());
		}
		System.out.println("directoresPeliculas  ");
		for(Pelicula p : c.directoresPeliculas()) {
			System.out.println(p.toString());
		}
		System.out.println("precioPelicula  ");
		for(Pelicula p : c.precioPelicula(3.50,3.20)) {
			System.out.println(p.toString());
		}
		System.out.println("peliculasAlquiler  ");
		for(Pelicula p : c.peliculasAlquiler()) {
			System.out.println(p.toString());
		}

	}

}
