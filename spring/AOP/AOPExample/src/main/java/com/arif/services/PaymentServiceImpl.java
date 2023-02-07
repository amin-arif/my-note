package com.arif.services;

public class PaymentServiceImpl implements PaymentService {
	
	public void show() {
		System.out.println("payment service system.....");
	}

	public void makePayment(double money) {
		System.out.println("Payment credited: " + money);
		System.out.println("Payment debited: " + money);	
	}

}
