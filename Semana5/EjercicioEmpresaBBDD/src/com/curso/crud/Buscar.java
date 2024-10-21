package com.curso.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.curso.conexion.ConexionBBD;
import com.curso.empleado.Empleado;
/**
	 * programa que conedra los metodos para buscar empleado por los campos que se requieran
	 * @author Ricardo
	 */
public class Buscar {
	
	static Connection conexion =ConexionBBD.conectarBase();
 
	/**
	 * 
	 * @param nombre
	 * @return empleado
	 * 
	 * metodo que hace una consulta de un select y devuelve todos los valores de un epmelado
	 * este metodo se puede apliar a todos los campos , mi iedea es hacer un menu switch si me da tiempo
	 */
	public static List<Empleado> buscarEmpleadosApellido(String apelldioUno) {
			//TO-DO separar por los campos que se quiere buscar y hacer un metodo general
		String query = "select * from empleados where apellido_uno like ? ;";
		try {
			
			  PreparedStatement ps = conexion.prepareStatement(query);
			  ps.setString(1, apelldioUno);
			 ResultSet rs =ps.executeQuery(query);
			 
			 List<Empleado> empleados = new ArrayList<>();
			 while(rs.next()) {
				 empleados.add( new Empleado(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellido_uno"),rs.getString("apellido_dos"),rs.getString("fecha_nacimiento")
							,rs.getInt("salario"))); 
					
			 }
			 return empleados;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
