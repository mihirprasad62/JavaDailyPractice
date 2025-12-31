package com.kodewala.markerinterface.usecasetwo;

public class Driver {

	public static void main(String[] args) {
		
		SilverUser user1=new SilverUser();
		PlatinumUser user2=new PlatinumUser();
		
		if(user2 instanceof IFamilyManSessionThreeApplicable) {
			System.out.println("You can watch the Family man.");
		}else {
			System.out.println("upgrade to platinum to enjoy the show.");
		}

	}

}
