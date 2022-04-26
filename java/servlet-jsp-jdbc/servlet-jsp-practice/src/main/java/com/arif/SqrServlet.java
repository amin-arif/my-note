package com.arif;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int value = (int) request.getAttribute("value");
		
		response.getWriter().print("<h1>Square result: " + (value * value) + "</h1>");
	}
}
