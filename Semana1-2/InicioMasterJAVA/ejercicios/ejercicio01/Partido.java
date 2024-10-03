package ejercicio01;

import java.util.ArrayList;

public class Partido {
	static ArrayList<Equipo> equipos;

	private String lugar;
	private int marcadorVisitante;
	private int marcadorDefensor;
	private Gol goles = new Gol();

	public Partido(String lugar, int marcadorVisitante, int marcadorDefensor, Gol goles) {
		super();
		this.lugar = lugar;
		this.marcadorVisitante = marcadorVisitante;
		this.marcadorDefensor = marcadorDefensor;
		this.goles = goles;
	}

	public Partido altaPartido(String lugar, int marcadorVisitante, int marcadorDefensor, Gol goles) {
		Partido miPartido = new Partido(lugar, marcadorVisitante, marcadorDefensor, goles);

		return miPartido;

	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	@SuppressWarnings("static-access")
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getMarcadorVisitante() {
		return marcadorVisitante;
	}

	public void setMarcadorVisitante(int marcadorVisitante) {
		this.marcadorVisitante = marcadorVisitante;
	}

	public int getMarcadorDefensor() {
		return marcadorDefensor;
	}

	public void setMarcadorDefensor(int marcadorDefensor) {
		this.marcadorDefensor = marcadorDefensor;
	}

	public Gol getGoles() {
		return goles;
	}

	public void setGoles(Gol goles) {
		this.goles = goles;
	}

	public String devolverJugadores() {

		for (Equipo miEquipo : equipos) {
			for (Jugador miJugador : miEquipo.getJugadores()) {
				String jugadorMostrar = miJugador.toString();
				return jugadorMostrar;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Partido [equipos=" + equipos + ", jugadores=" + devolverJugadores() + ", lugar=" + lugar
				+ ", marcadorVisitante=" + marcadorVisitante + ", marcadorDefensor=" + marcadorDefensor + ", goles="
				+ goles + "]";
	}

}
