package com.conversor.test;
 

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.conversor.Conversor;

 
class TestConversor {
	 
	Conversor conversor1 = null;
	Conversor conversor2 = null;
	@BeforeAll
	public void asignarValores() {
		conversor1= new Conversor();
		conversor2 = new Conversor();
	}
	

	@Test
	void test() {
		//arrange
		
		//esos son 30 euros en pesetas
		  double cantidadPesetas = 4491.58;
				
				//act & assert
		  conversor1.setCantidadEuros(30);
				assertEquals(conversor1.convertirEurosPesetas(),cantidadPesetas);
	}

}
