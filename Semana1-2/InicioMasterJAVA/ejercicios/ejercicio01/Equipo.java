package ejercicio01;

import java.io.Serializable;
import java.util.ArrayList;

 


public class Equipo implements Comparable<Equipo> , Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String nombre;
	public String liga;
	public int numeroPartidoJugados;
	public int numeroPartidosGanados;
	public ArrayList<Jugador> jugadores;
	
	
	//creacion del constructor donde se da de alta al array list y se ajuta el valor liga a minsuclas 
	//para que poder hacer un metodo
	public Equipo(String nombre, String liga, int numeroPartidoJugados, int numeroPartidosGanados) {
		super();
		this.nombre = nombre;
		this.liga = liga.toLowerCase();
		this.numeroPartidoJugados = numeroPartidoJugados;
		this.numeroPartidosGanados = numeroPartidosGanados;
		this.jugadores = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public int getNumeroPartidoJugados() {
		return numeroPartidoJugados;
	}

	public void setNumeroPartidoJugados(int numeroPartidoJugados) {
		this.numeroPartidoJugados = numeroPartidoJugados;
	}

	public int getNumeroPartidosGanados() {
		return numeroPartidosGanados;
	}

	public void setNumeroPartidosGanados(int numeroPartidosGanados) {
		this.numeroPartidosGanados = numeroPartidosGanados;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void dadaAltaJugadore(Jugador jugadorAlta) {
		if(!jugadorAlta.getDni().equals(null)  ) {
			jugadores.add(jugadorAlta);
			
			System.out.println("jugador añadido");
		}
		
	}

	@Override
	public int compareTo(Equipo o) {
	 
	return Integer.valueOf(numeroPartidosGanados).compareTo(Integer.valueOf(o.getNumeroPartidosGanados()));
		
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", liga=" + liga + ", numeroPartidoJugados=" + numeroPartidoJugados
				+ ", numeroPartidosGanados=" + numeroPartidosGanados + ", jugadores=" + jugadores + "]";
	}
	
	
	
	
	
	
	

}
