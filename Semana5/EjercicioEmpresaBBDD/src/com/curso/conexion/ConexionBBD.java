package com.curso.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBBD {
	  private static final String URL = "jdbc:mysql://localhost:3306/empresa";
	  private static final String USER = "root";
		 private static final String PWD = "root";
	 public static Connection conectarBase() {
		
		
		 try {
			Connection conexion = DriverManager.getConnection(URL,USER,PWD);
			return conexion;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		 
		 
	 }
	
	
}
