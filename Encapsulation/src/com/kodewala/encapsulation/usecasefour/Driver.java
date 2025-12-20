package com.kodewala.encapsulation.usecasefour;

class ATM {
	//variables
	
	private double balance;
	private String pin;
	
	//constructor
	
	public ATM(double _balance,String _pin) {
		balance=_balance;
		pin =_pin;
	}
	
	//method to withdraw money
	public void withdrawMoney(double _withdrawAmount,String _pin) {
		if(pin.equals(_pin) && _withdrawAmount<=balance ) {
			balance-=_withdrawAmount;
			System.out.println("After withdrawal the balance is "+balance);
		}
		else {
			System.out.println("You have entered incorrect pin or Insufficient balance");
		}
	}
	
	//method to deposit money
	
	public void depositMoney(double _depositAmount,String _pin) {
		if(pin.equals(_pin) && _depositAmount>0 ) {
			balance-=_depositAmount;
			System.out.println("After deposit the balance is "+balance);
		}
		else {
			System.out.println("You have entered incorrect pin or invalid amount");
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		
		//instance creation
		ATM user1=new ATM(10000,"1234");
		
		user1.depositMoney(100, "6789");
		user1.withdrawMoney(100, "1234");

	}

}
