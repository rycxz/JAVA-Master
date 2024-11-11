package com.curso.service;

import java.util.List;

import com.curso.model.Productos;
/**
 * 
 * @author Ricardo
 *
 */

public interface ProductosService {
	List<Productos> productos();
	Productos buscarProductos(int codProd);
 
	void actualizarProductosStock(int codProd,int stock);
	List<Productos> eliminarProducto(int codProd);
 
}
