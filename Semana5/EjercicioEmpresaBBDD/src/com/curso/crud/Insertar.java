package com.curso.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.curso.conexion.ConexionBBD;
/**
	 * @author Ricardo
	 * Clase que permite la inserccion de un nuevo empleado a su llamada
	 */
public class Insertar {
	 
	
	static Connection conexion =ConexionBBD.conectarBase();
	/**
	 * 
	 * @param nombre
	 * @param apellidoUno
	 * @param apellidoDos
	 * @param fechaNacimiento
	 * @param salario
	 * 
	 * metodo que recibe los paramteros a insertar y hace los procedmimentos que hagan faltan
	 */
	public static void insertarEmpleados(String nombre ,String apellidoUno, String apellidoDos,String fechaNacimiento,int salario) { 
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate fecha = LocalDate.parse( fechaNacimiento, formato);	
		String query = "INSERT INTO Empresa.Empleados (nombre, apellido_uno, apellido_dos, fecha_nacimiento, salario)"
				+ " VALUES (?,?,?,?,?); ";
		try {
			Statement sentencia = conexion.createStatement();
			 sentencia.executeUpdate(query);
			  PreparedStatement ps = conexion.prepareStatement(query);
			  ps.setString(1, nombre);
			  ps.setString(2, apellidoUno);
			  ps.setString(3, apellidoDos);
			  ps.setDate(4, java.sql.Date.valueOf(fecha));
			  ps.setInt(5, salario);
			  sentencia.executeUpdate(query); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 

}
