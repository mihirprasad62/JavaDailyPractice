package com.kodewala.encapsulation.usecaseone;

class BanKAccount{
	//variables of the class
	private double  balance;
	
	//constructor
	
	public BanKAccount(double _balance) {
		this.balance=_balance;
	}
	
	//method to get balance
	
	public void getBalance() {
		System.out.println("Available balance is "+balance);
	}
	
	//method to diposit money
	public void depositMoney(double _depositAmount) {
		balance+=_depositAmount;
		System.out.println("After depositing the amount is "+balance);
	}
	
	//method to withdraw money
	public void withdrawMoney(double _withdrawAmount) {
		if(balance>_withdrawAmount) {
			balance-=_withdrawAmount;
			System.out.println("After withdrawal the remaining amount is "+balance);
		}
		else {
			System.out.println("You have insufficient balance to withdraw.");
		}
	}
}

public class Driver {
	

	public static void main(String[] args) {
		
		BanKAccount account=new BanKAccount(50000);
		account.getBalance();
		account.withdrawMoney(60000);
		account.depositMoney(10000);
		

	}

}
