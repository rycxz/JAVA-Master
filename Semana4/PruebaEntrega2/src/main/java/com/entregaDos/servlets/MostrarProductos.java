package com.entregaDos.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.entregaDos.contendio.Almacen;
import com.entregaDos.contendio.Producto;

/**
 * Servlet implementation class MostrarProductos
 */
public class MostrarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarProductos() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        // Simular una lista de productos, por ejemplo, desde una base de datos o en memoria
		    	HttpSession sesion = request.getSession();
				Almacen almacen =   (Almacen) sesion.getAttribute("Alamcen");

		        // Preparar el response
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();

		  
		        out.println("<!DOCTYPE html>");
		        out.println("<html lang='es'>");
		        out.println("<head>");
		        out.println("<meta charset='UTF-8'>");
		        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		        out.println("<title>Lista de Productos</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>Lista de Productos Disponibles</h1>");
		        out.println("<ul>");

		    
		        for (Producto producto : almacen.getMisProductos()) {
		            out.println("<li>");
		            out.println("<strong>Nombre:</strong> " + producto.getNombre() + "<br>");
		            out.println("<strong>Marca:</strong> " + producto.getTipo() + "<br>");
		            out.println("<strong>Precio:</strong> $" + producto.getPrecio() + "<br>");
		            out.println("<strong>Stock:</strong> " + (producto.isStock() ? "Disponible" : "No disponible") + "<br>");
		            out.println("</li><br>");
		        }

		        out.println("</ul>");
		        out.println("<a href='index.html'>Volver al Inicio</a>");
		        out.println("</body>");
		        out.println("</html>");
		    }
		

	}


