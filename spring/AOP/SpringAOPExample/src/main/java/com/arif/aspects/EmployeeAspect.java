package com.arif.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	// It will execute for any Spring Bean method with signature public String getName()
	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.arif.services.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}
