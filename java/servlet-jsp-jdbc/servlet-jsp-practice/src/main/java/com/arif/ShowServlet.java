package com.arif;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		// int value = Integer.parseInt(request.getParameter("value"));
		// out.println("Lucky value: " + value);		
		
		// Use session to get data
		HttpSession session = request.getSession();
		String stmt = (String) session.getAttribute("statement");
		out.println("<h1>" + stmt + "</h1>");
		session.removeAttribute(stmt); // remove the data from session		
		
		
		// Use Cookie to get data
		Cookie cookies[] = request.getCookies();
		
		for(Cookie item : cookies) {
			if(item.getName().equals("value"))
				out.println("Calculated value: " + item.getValue());
		}
		
	}
}
