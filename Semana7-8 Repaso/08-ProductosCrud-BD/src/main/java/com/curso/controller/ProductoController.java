package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Productos;
import com.curso.service.ProductosService;

@RestController
public class ProductoController {
	@Autowired
	ProductosService productosService;
	@GetMapping(value = "productos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Productos> productos() {
		return productosService.productos();
	}
	@GetMapping(value = "productos/{codProd}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Productos buscarProductos(@PathVariable int codProd ) {
		return productosService.buscarProductos(codProd);
	}
 
	@PostMapping(value="productos/{codigoProducto}/{stock}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@RequestBody int  codProd, int stock) {
		 productosService.actualizarProductosStock(codProd,stock);
	}
	@DeleteMapping(value="productos/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Productos> eliminar(@PathVariable int codProd) {
		return productosService.eliminarProducto(codProd);
	}
	
}
