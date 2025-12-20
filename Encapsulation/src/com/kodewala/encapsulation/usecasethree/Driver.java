package com.kodewala.encapsulation.usecasethree;

class BankAccount{
	//variables
	
	private double balance;
	
	//method to deposit money
	
	public void depositMoney(double _depositAmount) {
		this.balance+=_depositAmount;
		System.out.println("After deposit the amount is "+balance);
	}
	
	//method to withdraw money
	
	public void withdrawMoney(double _withdrawAmount) {
		if(_withdrawAmount<=balance) {
			balance-=_withdrawAmount;
			System.out.println("After withdrawal the amount is "+balance);
		}else {
			System.out.println("You don't have sufficient balance to withdraw.");
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		//instance creation
		BankAccount account=new BankAccount();
		account.withdrawMoney(500);
		account.depositMoney(100);

	}

}
