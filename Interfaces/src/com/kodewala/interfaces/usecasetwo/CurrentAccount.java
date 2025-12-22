package com.kodewala.interfaces.usecasetwo;

public class CurrentAccount implements IBankAccount {
	// variable
	private double balance;

	// constructor
	public CurrentAccount(double _balance) {
		this.balance = _balance;
	}

	@Override
	public void deposit(double _amount) {
		balance += _amount;
		System.out.println("After depositing the balance is " + balance);

	}

	@Override
	public void withdraw(double _amount) {

		if (_amount < balance) {
			balance -= _amount;
			System.out.println("After withdrawal the balance is " + balance);
		} else {
			System.out.println("you have insufficient balance to withdraw.");
		}
	}

	@Override
	public void checkBalance() {
		System.out.println("CurrentAccount.checkBalance()");
	}

}
