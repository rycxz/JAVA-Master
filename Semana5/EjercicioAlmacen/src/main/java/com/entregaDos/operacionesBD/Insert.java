package com.entregaDos.operacionesBD;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nombre = request.getParameter("nombre");
         String apellido = request.getParameter("apellido");
         int edad = Integer.parseInt(request.getParameter("edad"));
         
         DataSource ds;
         
 try {
         Context initContext =        new InitialContext();
         Context envContext = (Context) initContext.lookup("java:/comp/env");
         ds = (DataSource) envContext.lookup("jdbc/MiDataSource");
         
         try (Connection conn = ds.getConnection()) {
                 
                 String sql = "INSERT INTO personas (nombre,apellido,edad)VALUES (?,?,?)";
                 PreparedStatement statement = conn.prepareStatement(sql);
                 statement.setString(1, nombre);
                 statement.setString(2,apellido);
                 statement.setInt(3, edad);
                 statement.executeUpdate();        
         } catch (SQLException e) {
 
                 e.printStackTrace();
         }
         
 } catch (NamingException e) {

         e.printStackTrace();
 }
         
 }

}
