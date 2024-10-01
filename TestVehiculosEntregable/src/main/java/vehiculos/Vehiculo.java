package vehiculos;
 
import java.time.LocalDateTime;

/**
 * 
 * @author Ricardo Sorin Almajan
 * @version 1.0
 *
 */

public  abstract  class Vehiculo implements Conducible   {
 
	
	protected   double vidaUtil = 0;
	protected String matricula = "";
	
	//metodos no final (opcionales)
	
	protected static int numeroRuedas;
	protected String marca;
	protected String color;
	
	//variables para metodos
	
	protected LocalDateTime incioMarcha;
	protected LocalDateTime finalMarcha;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDateTime getIncioMarcha() {
		return incioMarcha;
	}
	public void setIncioMarcha(LocalDateTime incioMarcha) {
		this.incioMarcha = incioMarcha;
	}
	public LocalDateTime getFinalMarcha() {
		return finalMarcha;
	}
	public void setFinalMarcha(LocalDateTime finalMarcha) {
		this.finalMarcha = finalMarcha;
	}
	public double getVidaUtil() {
		return vidaUtil;
	}
	public String getMatricula() {
		return matricula;
	}
	public static int getNumeroRuedas() {
		return numeroRuedas;
	}
	@Override
	public String toString() {
		return "Vehiculo [vidaUtil=" + vidaUtil + ", matricula=" + matricula + ", marca=" + marca + ", color=" + color
				 + "]";
	}
	public Vehiculo(String marca, String color ) {
		super();
		this.marca = marca;
		this.color = color;
		 
	}
	
	
	
	
	
 



 
 
 

	
	

	 
	
	
 
	
	
	
	
 
	
	

	

}
