package com.kodewala.polymorphism.usecaseone;

//parent class core banking
class CoreBanking{
	public void doFundTransfer(){
		System.out.println("fund transfer using core banking.");
	}
}

//child class upi

class UPI extends CoreBanking{
	@Override
	public void doFundTransfer() {
		System.out.println("fund transfer using UPI");
	}
}

//child class debit card
class DebitCard extends CoreBanking{
	@Override
	public void doFundTransfer() {
		System.out.println("fund transfer using Debit card.");
	}
}


