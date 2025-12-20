package com.kodewala.abstraction.usecasetwo;

abstract class Account{
	//variable of the class
	double balance;
	
	//constructor
	public Account(double _balance) {
		this.balance=_balance;
	}
	
	//abstract method (to be implemented by sub class)
	abstract void calculateInterest();
	
	//concrete method
	
	public void showBalance() {
		System.out.println("Current Balance is: "+balance);
	}
	
}

class SavingAccount extends Account{
	//variable
	double interestRate=5.0;
	
	//constructor
	public SavingAccount(double _balance) {
		super(_balance);
	}
	
	@Override
	public void calculateInterest() {
		System.out.println("SavingAccount.calculateInterest()");
	}
}

class CurrentAccount

public class Driver {

}
