package com.curso.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelecPrepared {

	public static void main(String[] args) throws SQLException {
		 
		 
			String url = "jdbc:mysql://localhost:3306/bdcurso";
				String user = "root";
				String pwd = "root";
				String query =("select * from persona where nombe like ? ;");
				String valorNombre = "'Ana'";
				Connection c = DriverManager.getConnection(url,user,pwd);
				PreparedStatement pr = c.prepareStatement(query);
				pr.setString(1, valorNombre);
				ResultSet rs = pr.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("apellido"));
				}
				
				
	}

}
