package com.bankSystem.Repository;

import java.sql.SQLException;

import com.bankSystem.Entity.User;
import com.bankSystem.Intefaces.IUser;

public class UserRepository implements IUser {
	
	DatabaseConnection dbConn;
	
	public UserRepository() {
		dbConn = new DatabaseConnection();
	}
	
	public int getUserId(String phone) throws SQLException {
		String  sql = "SELECT id FROM public.user WHERE nid_number = " + phone;
		
		dbConn.openConnection();
		dbConn.result = dbConn.stmt.executeQuery(sql);
		int id = dbConn.result.getInt("id");
		dbConn.closeConnection();
		
		return id;
	}
	
	public void insertIntoDatabase(User user) throws SQLException {
		String sql = "INSERT INTO public.user (name, age, gender, nid_number, phone, password)"
				+ "values "
				+ "('"+user.getName()+"',"+user.getAge()+", '"+user.getGender()+"', "+user.getNidNumber()+", '"+user.getPhone()+"', '"+user.getPassword()+"');";
		
		dbConn.openConnection();
		dbConn.stmt.executeQuery(sql);
		dbConn.closeConnection();
	}

}
