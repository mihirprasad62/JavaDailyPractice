package com.kodewala.markerinterface.usecaseone;

public class Driver {

	public static void main(String[] args) {
		
		User user1=new User();
		
		if (user1 instanceof ICashbackApplicable) {
			System.out.println("Congrats!!! You got 100 cashback");
		}else {
		System.out.println("Your next cash back is only a few rides away.");
		}

	}

}
