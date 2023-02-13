package com.arif;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arif.services.EmployeeService;

public class SpringMain 
{
    public static void main( String[] args ) {
        
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/arif/spring.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("John Dev");	
		employeeService.getEmployee().throwException();
		
		context.close();
    }
}
