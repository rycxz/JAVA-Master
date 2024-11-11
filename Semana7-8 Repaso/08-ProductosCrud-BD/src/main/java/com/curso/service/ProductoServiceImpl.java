package com.curso.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.model.Productos;
import com.curso.repository.ProductosRepository;
@Service
public class ProductoServiceImpl implements ProductosService {
	@Autowired
		ProductosRepository repository;
	 
	 
	@Override
	public List<Productos> productos() {
		 
		return repository.findAll();
	}

	@Override
	public Productos buscarProductos(int codProd) {
		  
		return repository.findById(codProd).orElse(null);
	}

 
	
 
	@Override
	public void actualizarProductosStock(int codProd,int stock) {
		repository.actualizarProductosStock(codProd, stock);

	}

	@Override
	public List<Productos> eliminarProducto(int codProd) { 
				repository.deleteById(codProd);
				return repository.findAll();
	}
 

}
