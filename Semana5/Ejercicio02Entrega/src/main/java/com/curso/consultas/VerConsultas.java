package com.curso.consultas;

import com.curso.model.Persona;

 

public class VerConsultas {

	public static void main(String[] args) {
		Consultas c = new Consultas();
	 

		System.out.println("  mostrarPerosnas");
		for(Persona p : c.mostrarPerosnas()) {
			System.out.println(p);
		}
		System.out.println("buscarPorID");
		for(Persona p : c.buscarPorID(3)) {
			System.out.println(p.toString());
		}
		System.out.println("buscarPorApellido1  ");
		for(Persona p : c.buscarPorApellido1("Pérez")) {
			System.out.println(p.toString());
		}
		System.out.println("buscarPorApellidos  ");
		for(Persona p : c.buscarPorApellidos("López","Martínez")) {
			System.out.println(p.toString());
		}
		
	}

}
