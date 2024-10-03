package ejercicio01;

import java.time.LocalDate;

public class Gol {
	private Jugador jugadorAnota;
	private Equipo golEquipo;
	private LocalDate momentoAnotacionGol;
	private String idPartido;
	public Jugador getJugadorAnota() {
		return jugadorAnota;
	}
	public void setJugadorAnota(Jugador jugadorAnota) {
		this.jugadorAnota = jugadorAnota;
	}
	public Equipo getGolEquipo() {
		return golEquipo;
	}
	public void setGolEquipo(Equipo golEquipo) {
		this.golEquipo = golEquipo;
	}
	public LocalDate getMomentoAnotacionGol() {
		return momentoAnotacionGol;
	}
	public void setMomentoAnotacionGol(LocalDate momentoAnotacionGol) {
		this.momentoAnotacionGol = momentoAnotacionGol;
	}
	public String getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(String idPartido) {
		this.idPartido = idPartido;
	}
	public Gol(Jugador jugadorAnota, Equipo golEquipo, LocalDate momentoAnotacionGol, String idPartido) {
		super();
		this.jugadorAnota = jugadorAnota;
		jugadorAnota.setGoles(jugadorAnota.getGoles()+1);
		this.golEquipo = golEquipo;
		 
		this.momentoAnotacionGol = momentoAnotacionGol;
		this.idPartido = idPartido;
	}
	@Override
	public String toString() {
		return "Gol [jugadorAnota=" + jugadorAnota + ", golEquipo=" + golEquipo + ", momentoAnotacionGol="
				+ momentoAnotacionGol + ", idPartido=" + idPartido + "]";
	}
	public Gol() {
		super();
	}
	
	
}
