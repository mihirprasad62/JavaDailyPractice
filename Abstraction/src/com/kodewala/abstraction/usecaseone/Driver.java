package com.kodewala.abstraction.usecaseone;

abstract class Bank {
	abstract void loanInterestRate(); //No implementation , only declaration
}

class HDFC extends Bank{
	void loanInterestRate() {
		System.out.println("HDFC loan interest is :8.25");
	}
}

public class Driver {
	public static void main(String[] args) {
		Bank bank =new HDFC(); //using Bank reference unaware of exact implementation.
		bank.loanInterestRate();
	}

}
