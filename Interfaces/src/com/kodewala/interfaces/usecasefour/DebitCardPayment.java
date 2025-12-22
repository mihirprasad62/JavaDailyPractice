package com.kodewala.interfaces.usecasefour;

public class DebitCardPayment implements IPaymentGateway {
	@Override
	public  void proceePayment(double _amount) {
		System.out.println("paid "+_amount+" by credit card.");
	}

	public static void main(String[] args) {
		IPaymentGateway.checkServiceStatus();
		
		IPaymentGateway dc= new DebitCardPayment();
		dc.validateTransaction();
		dc.proceePayment(10000);

	}

}
