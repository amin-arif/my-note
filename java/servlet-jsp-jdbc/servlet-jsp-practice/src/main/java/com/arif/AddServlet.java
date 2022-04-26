package com.arif;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int total = num1 + num2;
		
		// PrintWriter out = response.getWriter();		
		// out.println("Summation result: " + total);
		
		// request.setAttribute("value", num1+num2);
		// RequestDispatcher rd = request.getRequestDispatcher("sqr");
		// rd.forward(request, response);
		
		
		// response.sendRedirect("show?value=" + total); // URL Rewriting
		
		// HttpSession is an Interface. It is used to send data from servlet to servlet
		HttpSession session = request.getSession();
		session.setAttribute("statement", "Learn Practice Practice Practice");
		
		
		// HttpSession is a Class. It is used to send data from servlet to servlet
		Cookie cookie = new Cookie("value", total + ""); // It only send String data
		response.addCookie(cookie);
		
		response.sendRedirect("show");
	}

	// doGet() method only works with GET method and internally use service() method
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	}
	
	// doPost() method only works with POST method and internally use service() method
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	}
}
