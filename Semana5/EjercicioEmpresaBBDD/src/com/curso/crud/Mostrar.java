package com.curso.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.curso.conexion.ConexionBBD;
import com.curso.empleado.Empleado;
/**
	 * @author Ricardo
	 * Clase que muestra  los datos seleciconados por el usuario
	 */
public class Mostrar {
	
		static Connection conexion =ConexionBBD.conectarBase();
		/**
		 * metodo que devuele un arraylist con todos los empleados 
		 * @return
		 */
		public static ArrayList<Empleado> mostrarEmpleados() {
		String query = "Select * from Empleados;";
		try {
			Statement sentencia = conexion.createStatement();
			 ResultSet rs =sentencia.executeQuery(query);
			 List<Empleado> empleados = new ArrayList<>();
			 while(rs.next()) {
				 empleados.add( new Empleado(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellido_uno"),rs.getString("apellido_dos"),rs.getString("fecha_nacimiento")
							,rs.getInt("salario"))); 
			 }
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
		 
}
