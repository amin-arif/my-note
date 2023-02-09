package com.arif.services;

import com.arif.models.Employee;

public class EmployeeService {
	
	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee employee){
		this.employee = employee;
	}

}
