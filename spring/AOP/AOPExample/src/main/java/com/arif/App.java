package com.arif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arif.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/arif/config.xml");
    	
    	PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
    	
    	paymentService.show();
    	
    	paymentService.makePayment(2200);
    	
    	
    }
}
