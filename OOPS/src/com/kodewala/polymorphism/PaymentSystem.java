package com.kodewala.polymorphism;

//parent payment class
class Payment{
	void processPayment(double amount) {
		System.out.println("processing payment of "+amount);
	}
}

//child class represents creditCard payment

class CreditCardPayment extends Payment{
	@Override
	void processPayment(double amount) {
		System.out.println("paid "+amount+" using credit card");
	}
}

//child class represents upi payment

class UpiPayment extends Payment{
	@Override
	void processPayment(double amount) {
		System.out.println("paid "+amount+" using credit card");
	}
}

public class PaymentSystem {

	public static void main(String[] args) {
		Payment payment=new UpiPayment();
		payment.processPayment(500);
	}

}
