package com.kodewala.interfaces.usecasefour;

public class CreditCardPayment implements IPaymentGateway {

	@Override
	public void proceePayment(double _amount) {
		
		System.out.println("paid "+_amount+" by credit card.");
	}
	
	
	public static void main(String[] args) {
		IPaymentGateway.checkServiceStatus();
		
		IPaymentGateway cc=new CreditCardPayment();
		cc.validateTransaction();
		cc.proceePayment(9000);

	}

}
