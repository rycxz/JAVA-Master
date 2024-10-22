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
 * Servlet implementation class CrearConetnido
 */
public class CrearProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProducto() {
        super();
       
    }

	 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		       String idStr = request.getParameter("ID");
	            String tipo = request.getParameter("tipo");
	            String nombre = request.getParameter("nombre");
	          
	            String precioStr = request.getParameter("precio");
	            String imagen = request.getParameter("imagen");
	            String stockStr = request.getParameter("stock");
	            
	            int id = Integer.parseInt(idStr); 
	           
	            double precio = Double.parseDouble(precioStr); 
	            boolean stock = stockStr != null;
	            
	            Almacen miAlmacen = new Almacen();
	            miAlmacen.aniadirProducto(id, tipo, nombre, precio, stock);
	            miAlmacen.buscarProducto(id).setImagen(imagen);
	        
	   		 
	    		response.setContentType("text/html");
	    		PrintWriter out = response.getWriter();
	    		out.println("<!DOCTYPE html>\r\n"
	    				+ "<html lang=\"es\">\r\n"
	    				+ "<head>\r\n"
	    				+ "    <meta charset=\"UTF-8\">\r\n"
	    				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
	    				+ "    <title>Añadido con Éxito</title>\r\n"
	    				+ "</head>\r\n"
	    				+ "<body>\r\n"
	    				+ "    <h1>¡Producto Añadido con Éxito!</h1>\r\n"
	    				+ "    <p>El producto ha sido añadido correctamente.</p>\r\n"
	    				+ "    \r\n"
	    				+ "    <a href=\"index.html\">Volver al Inicio</a>\r\n"
	    				+ "</body>\r\n"
	    				+ "</html>");
	    		
	    		HttpSession sesion = request.getSession(true);
	    		sesion.setAttribute("Almacen",miAlmacen);
	    		sesion.setMaxInactiveInterval(999);

		 
	}

}
