package com.arif.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PaymentAspect {
	
	@Before("execution(* com.arif.services.PaymentServiceImpl.show())") // * means all return type
	public void showBefore() {
		System.out.print(".....Welcome to ");
	}
	
	@Before("execution(* com.arif.services.PaymentServiceImpl.makePayment(..))") // .. means parameterized method
	public void beforeMakePayment() {
		System.out.println("\n.....Transaction started.....");
	}
	
	@After("execution(* com.arif.services.PaymentServiceImpl.makePayment(..))")
	public void afterMakePayment() {
		System.out.print(".....Transaction finished.....\n");
	}

}
