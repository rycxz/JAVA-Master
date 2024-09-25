package ejercicio01;

import java.io.Serializable;

public class Jugador implements Serializable, Comparable<Jugador> {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String dni;
	private int goles;
	private int partidosJugados;
	private Equipo equipoPertenece;

	public Jugador(String nombre, String dni, int goles, int partidosJugados) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.goles = goles;
		this.partidosJugados = partidosJugados;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public Equipo getEquipoPertenece() {
		return equipoPertenece;
	}

	public void setEquipoPertenece(Equipo equipoPertenece) {
		this.equipoPertenece = equipoPertenece;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dni=" + dni + ", goles=" + goles + ", partidosJugados="
				+ partidosJugados + " y pertenece al equipo: " + equipoPertenece.getNombre();
	}

	@Override
	public int compareTo(Jugador o) {
		Integer golesIteger = this.goles;
		Integer golesOIteger = o.getGoles();
		
		return  golesIteger.compareTo(golesOIteger);
	}

}
