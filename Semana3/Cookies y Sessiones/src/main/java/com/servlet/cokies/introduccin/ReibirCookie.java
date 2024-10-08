package com.servlet.cokies.introduccin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Reibircookie
 */
public class ReibirCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReibirCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String respuesta="";
		Cookie[] listaCookies = request.getCookies();
		
		if(listaCookies!=null) {
			for(Cookie c:listaCookies) {
				respuesta+=c.getName()+": " +c.getValue();
			}
		}else {
			respuesta = "No hay Cookies";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Galletitas</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h1>Resultado de las Cookies</h1>");
		out.println("<p>"+ respuesta + "</p>");
		
		out.println("</body>");
		out.println("</html>");
		out.close();
;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
