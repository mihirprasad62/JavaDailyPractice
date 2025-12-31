package com.kodewala.markerinterface.usecaseThree;

public class Driver {

	public static void main(String[] args) {
		PremiumCustomer user1 =new PremiumCustomer();
		RegularCustomer user2 =new RegularCustomer();
		
		if(user2 instanceof IFreeDeliveryApplicable) {
			System.out.println("You are applicable for free delivery");
		}else {
			System.out.println("Upgrade to premium to get free delivery.");
		}

	}

}
