package com.kodewala.interfaces.usecasetwo;

public interface IBankAccount {
	//constants
	
	public static final double MIN_BALANCE=1000;
	
	//abstract methods
	
	public abstract void deposit(double _amount);
	public abstract void withdraw(double _amount);
	public abstract void checkBalance();
	
	

}
