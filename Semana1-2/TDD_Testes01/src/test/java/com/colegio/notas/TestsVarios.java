package com.colegio.notas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.curso.colegio.Nota;

class TestsVarios {

	@Test
	void esMismaAsiganturaTest() {
		//arrange
		Nota nota1 = new Nota("Mates", 9);
		Nota nota2 = new Nota("Lengua", 6);
		Nota nota3 = new Nota("Lengua", 6);
		
		//act
		boolean repuesta = nota1.esMismaAsigantura(nota2);
		boolean repuesta1 = nota2.esMismaAsigantura(nota3);
		//assert
		assertFalse(repuesta);
		assertTrue(repuesta1);
	}

	@Test
	void esIgualNotas() {
		//arrange
		 
		Nota nota2 = new Nota("Lengua", 6);
		Nota nota3 = new Nota("Lengua", 6);
		
		//act
	 
		boolean repuesta1 = nota2.equals(nota3);
		//assert
		assertTrue(repuesta1);
	 
	}
	@Test
	void esMayorTest() {
		//arrange
		 
		Nota nota2 = new Nota("Lengua", 8);
		Nota nota3 = new Nota("Lengua", 7);
		
		//act
	 
		boolean repuesta1 = nota2.esMayorNota(nota3);
		//assert
		assertTrue(repuesta1);
	 
	}
	
	
	
	

}
