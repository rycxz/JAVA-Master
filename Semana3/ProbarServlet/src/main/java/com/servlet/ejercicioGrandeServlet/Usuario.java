package com.servlet.ejercicioGrandeServlet;

import java.util.ArrayList;

public class Usuario {

	
	private String nombre;
	private ArrayList<String> clases = new ArrayList<>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getClases() {
		return clases;
	}
	public void setClases(ArrayList<String> clases) {
		this.clases = clases;
	}
	public Usuario(String nombre ) {
		super();
		this.nombre = nombre;
 
	}
	public String  mustroClases() {
		String claes = "";
		for(int i  = 0 ;i< getClases().size(); i++){
			claes = " ," + getClases().get(i);
			return claes;
		}
		return claes;
		
	}
	
	
}
