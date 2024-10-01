package testesCoches;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import vehiculos.Coche;
import vehiculos.Gestor;

class TestGestor {

	static Gestor miGestor = new Gestor();

	@BeforeAll
	public static void insertarPacientesRecetas() {
		System.out.println("BeforeAll");
		System.out.println("Insertaremos coches");
		Coche miCoche1 = new Coche("Audi", " negro " , "diesel ", "DPR3453", 34);
		Coche miCoche2 = new Coche("BMW", " negro " , "gasolina ", "DHJ2312", 14);
		Coche miCoche3 = new Coche("Mercedes ", " gris  " , "diesel ", "GPY6734", 54);
		miGestor.getVehiculosVarios().add(miCoche1);
		miGestor.getVehiculosVarios().add(miCoche2);
		miGestor.getVehiculosVarios().add(miCoche3);
		 
	}

	@Test
	public void comprobacionInstanciaCoches() {
		System.out.println("Comprobacion Instancia Coches  ");
		miGestor.aniadirVehiculo("Seat", " negro " , "diesel ", "EDR3421", 34,miGestor.getVehiculosVarios());
		Coche miCoche1 = new Coche("Audi", " negro " , "diesel ", "DPR3453", 34);
		equals(miGestor.buscarVehiculo("DPR3453", miGestor.getVehiculosVarios()) == miCoche1 );
		 
	}
	@Test
	public void comprobacionInstanciaCoches1() {
		System.out.println("Comprobacion Instancia Coches  ");
		miGestor.aniadirVehiculo("Seat", " negro " , "diesel ", "EDR3421", 34,miGestor.getVehiculosVarios());
		Coche miCoche1 = new Coche("Audi", " negro " , "diesel ", "DPR3453", 34);
		assertNotEquals(miGestor.buscarVehiculo("999999", miGestor.getVehiculosVarios()) , miCoche1 );
		 
	}
	 

	@AfterAll
	public static void mostramosCoches() {
		System.out.println("AfterAll");
		miGestor.listarVehiculos(miGestor.getVehiculosVarios());;
		 
		System.out.println("Mensaje fin");
	}
	 
}
