package com.kodewala.polymorphism.usecaseone;

public class Clients {
	
	public static void main(String[] args) {
		PaymentProcessor pp=new PaymentProcessor();
		
		UPI upi=new UPI();
		
		pp.processPayment(upi);
	}
	

}
