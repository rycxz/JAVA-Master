package com.curso.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/bdcurso";
		String user = "root";
		String pwd = "root";
		String query =("select * from persona where nombe like 'ana' ;");
		try (Connection conexion = DriverManager.getConnection(url,user,pwd);
				Statement sentencia = conexion.createStatement();
					ResultSet rs =sentencia.executeQuery(query);) {
			while (rs.next()) {
				System.out.println(rs.getString(1)+ " " + rs.getString(2) + 
						" " + rs.getInt(3));
			}
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}

	}

}
