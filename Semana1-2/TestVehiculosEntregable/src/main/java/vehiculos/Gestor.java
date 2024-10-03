package vehiculos;

import java.util.List;

public class Gestor {
	List<Vehiculo> vehiculosVarios ;
	
	public List<Vehiculo> llenadoArray(List<Vehiculo> vehiculosVarios  ){
 
		Coche miCoche1 = new Coche("Audi", " negro " , "diesel ", "DPR3453", 34);
		vehiculosVarios.add(miCoche1);
		
		Coche miCoche2 = new Coche("BMW", " negro " , "gasolina ", "DHJ2312", 14);
		vehiculosVarios.add(miCoche2);
		
		Coche miCoche3 = new Coche("Mercedes ", " gris  " , "diesel ", "GPY6734", 54);
		vehiculosVarios.add(miCoche3);
		
		return vehiculosVarios;
 
	}
	
	public void listarVehiculos( List<Vehiculo> vehiculosVarios) {
		for(Vehiculo variosCoches:vehiculosVarios ) {
			System.out.println(variosCoches);
		}
	}
	public void tiempoCondccion (List<Vehiculo> vehiculosVarios) {
		for(Vehiculo variosCoches:vehiculosVarios ) {
	 
		 
			variosCoches.tiempoMoviemiento();
		}
		
		
	}
	public void velcidadMedia (List<Vehiculo> vehiculosVarios) {
		for(Vehiculo variosCoches:vehiculosVarios ) {

	 
			variosCoches.calcularVelocidad( );
		}
		
		
	}
	public void aniadirVehiculo (String marca, String color, String tipoCombustible, String matricula, int vidaUtil, List<Vehiculo> coches ) {
		 if(comprobarCoche(matricula, coches) ==false) {
		Coche miCoche4 = new Coche(marca,color,tipoCombustible,matricula,vidaUtil);
		coches.add(miCoche4);
		 
		 }
		
	}
	public Coche buscarVehiculo  (  String matricula, List<Vehiculo> coches ) {
		for(Vehiculo variosCoches:coches ) {
		if(matricula.equalsIgnoreCase(variosCoches.getMatricula())) {
		 System.out.println(variosCoches);
		 return (Coche) variosCoches;
		}
		 
		}
		return null;
	
		
		
	}
	public boolean comprobarCoche(String matricula, List<Vehiculo> coches) {
		for(Vehiculo variosCoches:coches ) {
			if(matricula.equalsIgnoreCase(variosCoches.getMatricula())) {
				return true;
			}
		 
		else {
			return false;
		}
		
	}
		return false;
	}

	public List<Vehiculo> getVehiculosVarios() {
		return vehiculosVarios;
	}

	public void setVehiculosVarios(List<Vehiculo> vehiculosVarios) {
		this.vehiculosVarios = vehiculosVarios;
	}
	
	
	
}
