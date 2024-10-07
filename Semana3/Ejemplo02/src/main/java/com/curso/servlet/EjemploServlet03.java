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
public class EjemploServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet03() {
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

		out.println("<form action =\"EjempoServlet04.java\" method=\"post\"> ");

		out.println("<label for= \"actividad\">Dime la activadad que quieres realizar</label>");

		out.println("<input type=\"checkbox\" id=\"yoga\" name =\"yoga\" value=\"yoga\" /> Yoga");

		out.println(
				"<input type=\"checkbox\" id=\"artesMarcailes\" name =\"artesMarcailes\" value=\"artesMarcailes\" /> artesMarcailes");

		out.println("<input type=\"checkbox\" id=\"cinta\" name =\"cinta\" value=\"cinta\" />Cinta");

		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

		int limite = Integer.parseInt(request.getParameter("numero"));
		for (int i = 0; i < limite; i++) {
			out.println("hola caracola");
		}

		out.close();
	}

}
