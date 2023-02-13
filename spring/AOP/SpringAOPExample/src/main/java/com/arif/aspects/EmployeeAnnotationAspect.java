package com.arif.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.arif.aspects.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
