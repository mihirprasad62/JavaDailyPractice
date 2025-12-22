package com.kodewala.interfaces.usecasethree;

interface BankService{
	void deposit(double _amount);
}

interface LoanServices{
	void applyLoan(double _amount);
}

class Customer implements BankService,LoanServices{

	@Override
	public void applyLoan(double _amount) {
		System.out.println("Customer.applyLoan()");
		
	}
	public void deposit(double _amount) {
		System.out.println("Customer.deposit()");
	}
}

public class BankSystem {

	public static void main(String[] args) {
		Customer customer =new Customer();
		customer.applyLoan(1000);
		customer.deposit(9000);

	}

}
