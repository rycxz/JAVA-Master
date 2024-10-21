package com.curso.crud;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.curso.conexion.ConexionBBD;
/**
	 * @author Ricardo
	 * Clase que muestra  el salario medio de los empleados 
	 */
public class SalarioMedio {
	
		static Connection conexion =ConexionBBD.conectarBase();
		/**
		 * metodo que hace el avg de los empleados y muestra el salario meido de estos
		 */
		public static void mostrarSalarioMedio( ) {
		String query = "Select avg(salario) from Empleados;";
		try {
			Statement sentencia = conexion.createStatement();
			 ResultSet rs =sentencia.executeQuery(query);
			 System.out.println("El salario medio es " + rs.getInt(1));
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
}}
