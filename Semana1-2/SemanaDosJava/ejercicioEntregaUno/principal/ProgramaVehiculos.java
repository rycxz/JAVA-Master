package principal;

 
import java.util.ArrayList;
import java.util.List;

import vehiculos.Gestor;
import vehiculos.Vehiculo;

public class ProgramaVehiculos {

	public static void main(String[] args) {
		Gestor misVehiculos = new Gestor();
		List<Vehiculo> coches = new ArrayList<>();
				misVehiculos.llenadoArray(coches);
		
		misVehiculos.listarVehiculos(coches);
		System.out.println("-------------------------------------------------------------------------------------");
		misVehiculos.tiempoCondccion(coches);
		System.out.println("-------------------------------------------------------------------------------------");
		misVehiculos.velcidadMedia(coches);
		System.out.println("-------------------------------------------------------------------------------------");
		misVehiculos.buscarVehiculo("DHJ2312",coches);
		System.out.println("-------------------------------------------------------------------------------------");
		misVehiculos.aniadirVehiculo("Audi", "rojo", "gasolina" ,  "JPY4532", 120 ,coches );
		System.out.println("-------------------------------------------------------------------------------------");
		misVehiculos.listarVehiculos(coches);
	 
 
 
		
		
		 
		

	}

}
