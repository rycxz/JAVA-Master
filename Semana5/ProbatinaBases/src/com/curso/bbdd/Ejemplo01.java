package com.curso.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo01 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bdcurso";
		String user = "root";
		String pwd = "root";
		String query =("INSERT INTO articulo (codigo, nombre, precio,fabricante)VALUES (last_insert_id()+1,'Altavoces', '70','2');");
		try {
			
			Connection conexion = DriverManager.getConnection(url,user,pwd);
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
