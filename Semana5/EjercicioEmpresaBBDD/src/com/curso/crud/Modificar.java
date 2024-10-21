package com.curso.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;



import com.curso.conexion.ConexionBBD;

/**
 * @author Ricardo Clase que permite la eleccion y la modificacion de los datos
 *         seleciconados por el usuario
 */
public class Modificar {

	static Connection conexion = ConexionBBD.conectarBase();


	/**
	 * 
	 * @param apellidoUno
	 * @param salario
	 * 
	 * metodo que hace el update del salario
	 */
	public static void  modificarSalario(String apellidoUno,int salario) {
		String query = "UPDATE  Empleado"
				+ "SET salario = ? "
				+ "WHERE apellido_uno like ? ;";
		try {
			Statement sentencia = conexion.createStatement();
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, salario);
			ps.setString(2, apellidoUno);
			sentencia.executeUpdate(query);		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
}
