package com.kodewala.polymorphism.usecaseone;

public class PaymentProcessor {
	public void processPayment(CoreBanking corebanking) {
		corebanking.doFundTransfer();
	}
}
