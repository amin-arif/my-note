package com.arif.crud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.arif.crud.model.User;

// DAO -> Database Access Object
// It is design pattern to separate database related stuffs in different class
// It provides CRUD database operations for the table users in database.
public class UserDAO {
	
	Connection conn;
	PreparedStatement stmt;
	ResultSet resultSet;
	
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/workspace_db"; // Database URL
	private static final String USER = "postgres"; // Database user name
	private static final String PASSWORD = "12345678"; // Database password
	
	private static final String INSERT_USER = "INSERT INTO user (name, gender, age, email) VALUES (?, ?, ?, ?);";	
	private static final String SELECT_ALL_USER = "SELECT * FROM public.user;";
	private static final String SELECT_USER_BY_ID = "SELECT * FROM public.user WHERE id = ?;";
	private static final String DELETE_USER_BY_ID = "DELETE FROM public.user WHERE id = ?;";
	private static final String UPDATE_USER_BY_ID = "UPDATE public.user SET name = ?, SET gender = ?, SET age = ?, SET email = ? WHERE id = ?;";
	
	public UserDAO() {}
	
	public void openConnection() {	
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);	
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			if (conn != null) conn.close();
			if (stmt != null) stmt.close();
			if (resultSet != null) resultSet.close();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertUserIntoDb(User user) throws SQLException {
		openConnection();
		stmt = conn.prepareStatement(INSERT_USER);
		
		stmt.setString(1, user.getName());
		stmt.setString(2, user.getGender());
		stmt.setInt(3, user.getAge());
		stmt.setString(4, user.getEmail());
		
		stmt.executeUpdate();
		closeConnection();
	}
	
	public boolean updateUserIntoDb(User user) throws SQLException {
		openConnection();
		stmt = conn.prepareStatement(UPDATE_USER_BY_ID);
		
		stmt.setString(1, user.getName());
		stmt.setString(2, user.getGender());
		stmt.setInt(3, user.getAge());
		stmt.setString(4, user.getEmail());
		stmt.setInt(5, user.getId());
		
		closeConnection();
		
		return (stmt.executeUpdate() > 0);
	}
	
	public User getUserFromDb(int id) throws SQLException {
//		openConnection();
//		
//		User user = null;
//		stmt = conn.prepareStatement(SELECT_USER_BY_ID);		
//		stmt.setInt(1, id);		
//		resultSet = stmt.executeQuery(); 
//		
//		while(resultSet.next()) {
//			String name = resultSet.getString("name");
//			String gender = resultSet.getString("gender");
//			int age = resultSet.getInt("age");
//			String email = resultSet.getString("email");
//			
//			user = new User(name, gender, age, email);
//		}
//		
//		closeConnection();
		User user = new User("John", "Male", 18, "john@email.com");
		
		return user;
	}
	
	public ArrayList<User> getAllUserFromDb() throws SQLException {
		/*
		 * openConnection();
		 * 
		 * ArrayList<User> userList = new ArrayList<User>(); stmt =
		 * conn.prepareStatement(SELECT_ALL_USER); resultSet = stmt.executeQuery();
		 * 
		 * while(resultSet.next()) { int id = resultSet.getInt("id"); String name =
		 * resultSet.getString("name"); String gender = resultSet.getString("gender");
		 * int age = resultSet.getInt("age"); String email =
		 * resultSet.getString("email");
		 * 
		 * User user = new User(id, name, gender, age, email); userList.add(user); }
		 * 
		 * closeConnection();
		 */
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User(1, "Arif", "Male", 24, "arif@gmail.com"));
		userList.add(new User(1, "Kanon", "Male", 25, "kanon@gmail.com"));
		
		return userList;
	}
	
	public boolean deleteUserFromDb(int id) throws SQLException {
		openConnection();
		
		stmt = conn.prepareStatement(DELETE_USER_BY_ID);		
		stmt.setInt(1, id);
		
		closeConnection();	
		
		return (stmt.executeUpdate() > 0);
	}
}











