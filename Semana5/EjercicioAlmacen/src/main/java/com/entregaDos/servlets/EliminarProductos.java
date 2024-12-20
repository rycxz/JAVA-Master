package com.entregaDos.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.entregaDos.contendio.Almacen;

/**
 * Servlet implementation class EliminarProductos
 */
public class EliminarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		HttpSession sesion = request.getSession();
		Almacen almacen =   (Almacen) sesion.getAttribute("Alamcen");
	      String idStr = request.getParameter("ID");
	      int id = Integer.parseInt(idStr); 
		almacen.eliminarPRoducto(id);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"es\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Elimnado con Éxito</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>¡Producto elimnado con Éxito!</h1>\r\n"
				+ "    <p>El producto ha sido elimnado correctamente.</p>\r\n"
				+ "    \r\n"
				+ "    <a href=\"index.html\">Volver al Inicio</a>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
