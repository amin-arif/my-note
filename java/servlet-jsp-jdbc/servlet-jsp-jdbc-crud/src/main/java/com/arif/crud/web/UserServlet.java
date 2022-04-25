package com.arif.crud.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


import com.arif.crud.dao.UserDAO;
import com.arif.crud.model.User;

@WebServlet("/")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
	
	public UserServlet() {
		this.userDAO = new UserDAO();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		
		switch (action) {
		case "/create":
			showNewForm(request, response);
			break;
			
		case "/insert":
			try {
				insertUser(request, response);
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
			break;
			
		case "/update":
			try {
				updateUser(request, response);
			} catch (SQLException | IOException e1) {
				e1.printStackTrace();
			}
			break;
			
		case "/delete":
			try {
				deleteUser(request, response);
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
			break;
			
		case "/edit":
			try {
				showEditForm(request, response);
			} catch (SQLException | IOException | ServletException e) {
				e.printStackTrace();
			}
			break;	

		default:
			try {
				showUserList(request, response);
			} catch (SQLException | IOException | ServletException e) {
				e.printStackTrace();
			}
			break;
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}
	
	
	
	/*-------------------- Custom Method for CRUD operation --------------------------*/
	
	private void showUserList(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
	{
		ArrayList<User> userList = userDAO.getAllUserFromDb();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("userList", userList);
		dispatcher.forward(request, response);
	}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}
	
	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException 
	{	
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		
		User user = new User(name, gender, age, email);
		userDAO.insertUserIntoDb(user);
		
		response.sendRedirect("user-list");
	}
	
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException 
	{	
		int id = Integer.parseInt(request.getParameter("id"));
		userDAO.deleteUserFromDb(id);
		
		response.sendRedirect("user-list");
	}
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException 
	{	
//		int id = Integer.parseInt(request.getParameter("id"));
		int id = 2;
		User user = userDAO.getUserFromDb(id);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", user);
		dispatcher.forward(request, response);
	}
	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException 
	{	
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		
		User user = new User(id, name, gender, age, email);
		userDAO.updateUserIntoDb(user); 
		
		response.sendRedirect("user-list");
	}
	
}
































