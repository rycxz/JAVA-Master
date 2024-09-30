package vehiculos;

import java.time.LocalDate;

/**
 * 
 * @author Ricardo Sorin Almajan
 * @version 1.0
 *
 */

public  abstract  class Vehiculo implements Conducible   {
 
	
	private final double vidaUtil ;
	private final String matricula ;
	
	//metodos no final (opcionales)
	
	private int numeroRuedas;
	private String medioDesplazamiento;
	private String finalidad;
	private String tipoCombustible; 
	private int consumo;
	private String marca;
	private String color;
	
	//variables para metodos
	
	private LocalDate incioMarcha;
	private LocalDate finalMarcha;;
	
	public Vehiculo(double vidaUtil, String matricula, int numeroRuedas, String medioDesplazamiento, String finalidad,
			String tipoCombustible, int consumo, String marca,String color) {
		super();
		this.vidaUtil = vidaUtil;
		this.matricula = matricula;
		this.numeroRuedas = numeroRuedas;
		this.medioDesplazamiento = medioDesplazamiento;
		this.finalidad = finalidad;
		this.tipoCombustible = tipoCombustible;
		this.consumo = consumo;
		this.marca = marca;
		this.color= color;
	}

	 
	
	//creacion setter & getters
	public int getNumeroRuedas() {
		return numeroRuedas;
	}

 

	public String getMedioDesplazamiento() {
		return medioDesplazamiento;
	}

	public void setMedioDesplazamiento(String medioDesplazamiento) {
		this.medioDesplazamiento = medioDesplazamiento;
	}

	public String getFinalidad() {
		return finalidad;
	}

	public void setFinalidad(String finalidad) {
		this.finalidad = finalidad;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public double getVidaUtil() {
		return vidaUtil;
	}

	public String getMatricula() {
		return matricula;
	}
	



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


	//SETTER GETTERS metodo marcha
	
	public LocalDate getIncioMarcha() {
		return incioMarcha;
	}



	public void setIncioMarcha(LocalDate incioMarcha) {
		this.incioMarcha = incioMarcha;
	}



	public LocalDate getFinalMarcha() {
		return finalMarcha;
	}



	public void setFinalMarcha(LocalDate finalMarcha) {
		this.finalMarcha = finalMarcha;
	}

	//creacion del toString 


	@Override
	public String toString() {
		return "Vehiculo [vidaUtil=" + vidaUtil + ", matricula=" + matricula + ", numeroRuedas=" + numeroRuedas
				+ ", medioDesplazamiento=" + medioDesplazamiento + ", finalidad=" + finalidad + ", tipoCombustible="
				+ tipoCombustible + ", consumo=" + consumo + ", marca=" + marca + ", color=" + color + ", incioMarcha="
				+ incioMarcha + ", finalMarcha=" + finalMarcha + "]";
	}


	

	
	

	 
	
	
 
	
	
	
	
 
	
	

	

}
