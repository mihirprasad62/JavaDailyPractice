package com.kodewala.polymorphism;

//parent account class
class BankAccount{
	//method to calculate interest
	public void calculateInterest() {
		System.out.println("The interest is 0.5%");
	}
}

//child saving account

class SavingAccount extends BankAccount{
	@Override
	public void calculateInterest() {
		System.out.println("The interest is 7%");
	}
}

//child fixed diposit

class FixedDiposit extends BankAccount{
	@Override
	public void calculateInterest() {
		System.out.println("The interest is 9%");
	}
}

public class InterestCalculation {
	//entry point
	public static void main(String[] args) {
		//creating reference of parent class
		BankAccount account;
		account=new SavingAccount();
		account.calculateInterest();//output depends on actual object SavingAccount
		account=new FixedDiposit();
		account.calculateInterest();//output depends on actual object FixedDiposit
	}
	
	
	
	//pointing to different objects

}
