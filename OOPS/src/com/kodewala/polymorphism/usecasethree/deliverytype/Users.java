package com.kodewala.polymorphism.usecasethree.deliverytype;

public class Users {

	public static void main(String[] args) {
		ProcessDeliveryFee processFee=new ProcessDeliveryFee();
		
		ExpressDelivery ed=new ExpressDelivery();
		
		processFee.processDeliveryFare(ed, 50);

	}

}
