package com.conversor;

public class Conversor {

 
	private double  cantidadPesetas;
	private double  cantidadEuros;
	
	
	
	 public static final double CONVERSION_EUROS_PESETAS = 166.386;
	 
	 public double convertirPesetasEuros(  ) {
		 double cantidadEurosObtenidos =  ( cantidadPesetas/CONVERSION_EUROS_PESETAS);
		 setCantidadEuros(cantidadEurosObtenidos);
		 return cantidadEurosObtenidos ;
		 
	 }
	 public double convertirEurosPesetas(  ) {
		 double cantidadPesetasObtenidos =  ( cantidadEuros*CONVERSION_EUROS_PESETAS);
		 setCantidadPesetas(cantidadPesetasObtenidos);
		 return cantidadPesetasObtenidos ;
	 }
	public Conversor( ) {
		 
	}
	public double getCantidadPesetas() {
		return cantidadPesetas;
	}
	public void setCantidadPesetas(double cantidadPesetas) {
		this.cantidadPesetas = cantidadPesetas;
	}
	public double getCantidadEuros() {
		return cantidadEuros;
	}
	public void setCantidadEuros(double cantidadEuros) {
		this.cantidadEuros = cantidadEuros;
	}
	
	 

}
