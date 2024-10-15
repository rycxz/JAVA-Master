package com.servlet.ejercicioGrandeServlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

 

/**
 * Servlet implementation class RecojerSesion
 */
public class RecojerSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecojerSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		
		Usuario user = new Usuario( request.getParameter("usuario"));
		
		request.setAttribute("usuario", user);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Clases Usuario </title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1>Bienvendio"+ user.getNombre()+" </h1>");
		out.println("<fieldset>\r\n"
				+ "  <legend>Elige tus clases</legend>\r\n"
				 
				+ " <form action ='MustroClases.java' method='post'>"
				+ "    <input type=\"checkbox\" id=\"yoga\" name=\"clases\" value=\"yoga\" />\r\n"
			 
				+ "    <input type=\"checkbox\" id=\"artesMarciales\" name=\"clases\" value=\"artesMarciales\" />\r\n"
				
				+  "    <input type=\"checkbox\" id=\"pilates \" name=\"clases\" value=\"pilates\" />\r\n"
				+ "  </form>\r\n"
				+ "</fieldset>");
			
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
