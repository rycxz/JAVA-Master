package com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemploServlet03
 */
public class EjempoServlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjempoServlet04() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");

		if(request.getParameter("yoga") != null) {
			out.println("<p>Has selecionado yoga </p>");
		}
		if(request.getParameter("artesMarciales") != null) {
			out.println("<p>Has selecionado yoga </p>");
		}
	 
		if(request.getParameter("cinta") != null) {
			out.println("<p>Has selecionado yoga </p>");
		}
	 
		
	 
		out.println("</body>");
		out.println("</html>");
		
		
		 
		
		out.close();
	}

}
