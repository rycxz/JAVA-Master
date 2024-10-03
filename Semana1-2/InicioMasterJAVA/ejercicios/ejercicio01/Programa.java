package ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Programa {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Vamos a crear los juagores");
			ArrayList<Equipo> equipos = new ArrayList<>();
			Jugador jugador1= new Jugador("Jesus Z.", "RT3432X", 10, 14);
			Jugador jugador2= new Jugador("Ramierz T.", "3344", 14, 14);
			Jugador jugador3= new Jugador("Jesus 2.", "434f", 10, 14);
			Jugador jugador4= new Jugador("Gonzales Z.", "fdffd3", 130, 1114);
			Jugador jugador5= new Jugador("Jamal M.", "vvvv3", 120, 164);
			Jugador jugador6= new Jugador("Casco f.", "ggdd3", 102, 64);
			Jugador jugador7= new Jugador("Juanme Z.", "jhyyr5", 104, 24);
			Jugador jugador8= new Jugador("Juan Z.", "66657", 1340, 1434);
			Jugador jugador9= new Jugador("Zero 2.", "jjyrds3", 150, 94);
			Jugador jugador10= new Jugador("Pablo Z.", "5454frdr", 30, 54);
			Jugador jugador11= new Jugador("Carlos Z.", "45433f", 5, 2);
			Jugador jugador12= new Jugador("Guille Z.", "44646463ff", 56, 345);
			
			Equipo equipoVisitante = new Equipo("Barcelona FC", "Champions", 345, 2345);
			Equipo equipoDefensor = new Equipo("Real Madrid", "Champions", 545, 2295);
			
			System.out.println("jugadores y equipos creados");
			System.out.println("-------------------------------------------------------");
			System.out.println();
			jugador1.setEquipoPertenece(equipoVisitante);
			equipoVisitante.dadaAltaJugadore(jugador1);
			
			
			jugador2.setEquipoPertenece(equipoVisitante);
			equipoVisitante.dadaAltaJugadore(jugador2);
			
			
				jugador3.setEquipoPertenece(equipoVisitante);
			
			equipoVisitante.dadaAltaJugadore(jugador3);
			
		jugador4.setEquipoPertenece(equipoVisitante);
			equipoVisitante.dadaAltaJugadore(jugador4);
			
			
				jugador5.setEquipoPertenece(equipoVisitante);
			equipoVisitante.dadaAltaJugadore(jugador5);
			
		
			jugador6.setEquipoPertenece(equipoVisitante);
			
			equipoVisitante.dadaAltaJugadore(jugador6);
			
			
			// CONFIGURAMOS EL OTRO EQUIPO
			jugador7.setEquipoPertenece(equipoDefensor);
			equipoDefensor.dadaAltaJugadore(jugador7);
			
			
				jugador8.setEquipoPertenece(equipoDefensor);
			equipoDefensor.dadaAltaJugadore(jugador8);
			
		
			jugador9.setEquipoPertenece(equipoDefensor);
			equipoDefensor.dadaAltaJugadore(jugador9);
			
			
				jugador10.setEquipoPertenece(equipoDefensor);
			equipoDefensor.dadaAltaJugadore(jugador10);
			
		
			jugador11.setEquipoPertenece(equipoDefensor);
			equipoDefensor.dadaAltaJugadore(jugador11);
			
			
			jugador12.setEquipoPertenece(equipoDefensor);
			equipoDefensor.dadaAltaJugadore(jugador12);
			
			equipos.add(equipoDefensor);
			equipos.add(equipoVisitante);
			for (Equipo miEquipo : equipos) {
				Collections.sort(miEquipo.getJugadores());
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------");
			
			if(equipoDefensor.compareTo(equipoVisitante)==0) {
				System.out.println("el equipo con mas goles es " + equipoDefensor.getNombre());
			}
			else {
				System.out.println("el quipo con mas goles es " +equipoVisitante.getNombre() );
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------");
			 //ordenamos los jugadores por los numeros de goles
			 System.out.println("El juagdor mas goleador del equipo uno es: "+ equipoDefensor.getJugadores().get(equipoDefensor.getJugadores().size()-1));
			
			 System.out.println("El juagdor mas goleador del equipo dos es: " + equipoVisitante.getJugadores().get(equipoVisitante.getJugadores().size()-1));
			 
	for(Jugador jugadorGoleador:equipoVisitante.getJugadores() ) {
		System.out.println(jugadorGoleador);
	}
	System.out.println("mostramos los equipos ----------------------------------");
	System.out.println();
	System.out.println(equipoDefensor);
	System.out.println("-------------------------------------------------------------");
	System.out.println();
	System.out.println(equipoVisitante);
	System.out.println("-------------------------------------------------------------");
	System.out.println();
	System.out.println("alta gol");
	Gol goles = new Gol(jugador1,equipoDefensor,LocalDate.now(),"3344r");
	System.out.println(goles);
	
	System.out.println("-------------------------------------------------------------");
	System.out.println();
	Partido miPartido = new Partido("Girona", 4, 3, goles);
	 
	miPartido.setEquipos(equipos);
	 
	System.out.println(miPartido);
	System.out.println("-------------------------------------------------------------");
	System.out.println();
	//mostramos 
	
	}
	
	

}
