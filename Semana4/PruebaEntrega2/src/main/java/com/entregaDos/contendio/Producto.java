package com.entregaDos.contendio;


/**
 * 
 * @author Ricardo
 * Es la clase de producto con sus atributos
 *
 */
public class Producto {
	private int ID;
	private String tipo;
	private String nombre;

	private double precio;
	private String imagen;
	private boolean stock;
	
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
 
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
public Producto(int iD, String tipo, String nombre , double precio,boolean stock  ) {
	super();
	ID = iD;
	this.tipo = tipo;
	this.nombre = nombre;
	 
	this.precio = precio;
	 this.stock = stock;
}
//no esta previsto su uso 
@Override
public String toString() {
	return "Producto [ID=" + ID + ", tipo=" + tipo + ", nombre=" + nombre  + ", precio=" + precio
			+ ", stock=" + stock + "]";
}
}
	
	 