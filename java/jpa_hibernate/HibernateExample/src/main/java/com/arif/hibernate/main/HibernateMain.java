package com.arif.hibernate.main;

import java.util.Date;

import org.hibernate.Session;

import com.arif.hibernate.model.Employee;
import com.arif.hibernate.util.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("John Dev");
		emp.setRole("CTO");
		emp.setInsertTime(new Date());
		
		// Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		// Start transaction
		session.beginTransaction();
		// Save the Model object
		session.save(emp);
		
		// Commit Transaction:
		// commit() will make data stored in the database permanent.
		// There is no way you can rollback your transaction once the commit() succeeds.
		session.getTransaction().commit();
		System.out.println("---------- Employee ID = "+emp.getId() + " ----------");
		
		// Terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}

}
