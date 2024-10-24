package com.entregaDos.contendio;

import java.util.ArrayList;

public class Almacen {
	ArrayList<Producto> misProductos;
	
	//ideas varias
	ArrayList<Producto> productosNoStok;
	/*serviria para poder ir añadiendo y quitando elementos segun su disponiblidad*/
	ArrayList<Producto> clientesEnEspera;
	//la idea seria crear un clase que sea cliente-producto para poder saber que cliene
	//espera que producto para asi poder tenerlo controlado
	public Almacen() {
		super();
		this.misProductos = new ArrayList<>();
	}
	
	public ArrayList<Producto> getMisProductos() {
		return misProductos;
	}


	public void setMisProductos(ArrayList<Producto> misProductos) {
		this.misProductos = misProductos;
	}


	public String aniadirProducto(int iD, String tipo, String nombre, double precio, boolean stock) {
		for(Producto prod : misProductos) {
			if(prod.getID()!= iD) {
				misProductos.add(new Producto (iD,tipo,nombre,precio,stock));
				return "Prodcto aniadio con exito!";
			}
			else {
				 
			}
		}
		return null;
	}
	public Producto buscarProducto(int iD) {
		for(Producto prod : misProductos) {
			if(prod.getID()!= iD) {
				return null;
			}
			else {
				return prod;
			}
	}
		return null;

	}
	public void eliminarPRoducto(int iD) {
		for(Producto prod : misProductos) {
			if(prod.getID()!= iD) {
				 
			}
			else {
				
				misProductos.remove(prod);
				 
			}
	}
	 

	}
	
}
