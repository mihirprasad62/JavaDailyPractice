/* Social Media Application */

package com.kodewala.datatypes;

public class UserProfile {
	
	//variable of the class
	
	private String userId;
	private String userName;
	private String emailId;
	private boolean isEmailVerified;
	
	//constructor
	
	public UserProfile(String _userName,String _emailId,boolean _isEmailVerified) {
		this.userName=_userName;
		this.emailId=_emailId;
		this.isEmailVerified=_isEmailVerified;
	}
	
	//method to display user details
	public void displayUserDetails() {
		System.out.println("User name: "+userName);
		System.out.println("User email: "+emailId);
		System.out.println("Email verified: "+isEmailVerified);
		
	}
	
	//entry point
	public static void main(String[] args) {
		//instance of class UserProfile
		UserProfile user =new UserProfile("Mihir","mihir@gmail.com",true);
		user.displayUserDetails();

	}

}
