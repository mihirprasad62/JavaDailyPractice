package com.kodewala.stringoperation.usecaseone;

public class UserRegistration {
	// state of class

	private String userName = "mihr prasad bhuyan";
	private String userPassword;

	// constructor

	UserRegistration(String _userName, String _userPassword) {
		this.userName = _userName;
		this.userPassword = _userPassword;
	}

	// method to mask password
	public String maskPassword(String _password) {
		String masked = "";
		for (int i = 0; i < _password.length(); i++) {
			masked += "*";
		}
		return masked;
	}

	// method to validate user input

	public void validateUserInput(String _input,String _password) {
		//1.trim extra space
		 userName=userName.trim();
		System.out.println(userName);
		
		//2.check empty input
		if(userName.length()>0 ) {
			System.out.println("The String has some content");
		}else {
			System.out.println("empty string.Please provide with some name");
		}
		
		//3.case sensitive login check
		System.out.println(userName.equalsIgnoreCase(_input));
		
		//4.validate email format
		if(_input.contains("@") && _input.endsWith(".com")) {
			System.out.println("valid email");
		}else {
			System.out.println("invalid email");
		}
		
		//5.mask password while logging
		
		 System.out.println(maskPassword(_password));
		
		
	}

}
