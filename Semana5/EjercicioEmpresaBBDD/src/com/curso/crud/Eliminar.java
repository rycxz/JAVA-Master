package com.curso.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;

import com.curso.conexion.ConexionBBD;

public class Eliminar {
	/**
	 * @author Ricardo
	 * CLASE QUE PERMITE A SU LLAMADA ELEMINAR UN USUARIO
	 */
	static Connection conexion =ConexionBBD.conectarBase();
	public static void  eliminarEmpleado(String nombre) {
		//TO-DO separar por los campos que se quiere buscar y hacer un metodo general

	String query = "delete from empleado "
			+ "  where apellido_uno like ?";
	try {
		  PreparedStatement ps = conexion.prepareStatement(query);
		  ps.setString(1, nombre);
		  try(Statement sentenciaEliminar = conexion.createStatement();) {
					if(	sentenciaEliminar.executeUpdate(query)>0) {
						System.out.println("Registro eliminado");
					}else {
						System.out.println("Ningún registro cumple la condición");	
					}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}

}
