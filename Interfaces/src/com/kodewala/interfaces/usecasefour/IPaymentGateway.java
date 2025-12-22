package com.kodewala.interfaces.usecasefour;

public interface IPaymentGateway {
	//default method
	default void validateTransaction() {
		log("Validating Transaction");
		System.out.println("Transaction validated.");
	}
	
	//static method 
	static void checkServiceStatus() {
		log("payment service is active");
	}
	
	//private method
	private static void log(String message) {
		System.out.println("[log]"+message);
	}
	
	//abstract method
	public abstract void proceePayment(double _amount);

}
