package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer>{
				@Query("UPDATE Producto p  SET stock = stock - :stock   where codigoProducto = :codigoProducto and stock=>0 and "
						+ " stock => :stock")
				void actualizarProductosStock(int codigoProducto,int stock);
			

}
