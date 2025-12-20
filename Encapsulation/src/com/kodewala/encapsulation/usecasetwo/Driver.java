package com.kodewala.encapsulation.usecasetwo;

class ATM{
	//variables of the class
	
	private double balance=10000;
	private String pin="1234";
	
	//method to withdraw money
	
	public void withdrawMoney(String _enteredPin,double _withdrawAmount) {
		if(pin.equals(_enteredPin) && _withdrawAmount<=balance) {
			balance-=_withdrawAmount;
			System.out.println("After withdrawal the available balance is "+balance);
		}
		else {
			System.out.println("You have entered incorrect pin or insufficient balnce");
		}
	}
	
	//method to deposit money
	
	public void depositMoney(String _enteredPin,double _depositAmount) {
		if(pin.equals(_enteredPin) && _depositAmount>0) {
			balance+=_depositAmount;
			System.out.println("after deposit the balance is "+balance);
		}
		else {
			System.out.println("You have entered incorrect pin or not a valid amount");
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		
		ATM user1=new ATM();
		/*
		user1.balance=10000; can't access the ATM class data
		*/
		
		user1.depositMoney("1234", 10);
		user1.withdrawMoney("1234", 20000);

	}

}
