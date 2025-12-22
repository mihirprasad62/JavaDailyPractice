package com.kodewala.interfaces.usecasetwo;

public class SavingAccount implements IBankAccount {

	// variables
	private double balance;

	// constructor
	public SavingAccount(double _balance) {
		this.balance = _balance;
	}

	@Override
	public void deposit(double _amount) {
		balance+=_amount;
		System.out.println("After depositing the balance is "+balance);
	}

	@Override
	public void withdraw(double _amount) {
		if(balance> MIN_BALANCE && _amount<balance) {
			balance-=_amount;
			System.out.println("After withdrawal the balance is "+balance);
		}else {
			System.out.println("you have insufficient balance to withdraw.");
		}
	}

	@Override
	public  void checkBalance() {
		System.out.println("SavingAccount.checkBalance()");
	}

}
