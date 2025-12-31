package com.kodewala.strings.usecasetwo;

/*
 
 Problem Statement:
Given user information (name, email, mobile number, and password), validate and extract information.

Use Cases to Implement:


Check if email contains '@' and '.'.
Extract domain name from email (e.g., from abc@gmail.com → gmail).
Validate mobile number (must be 10 digits).
Check if password contains at least one uppercase, one lowercase, one digit, and one special character.
Replace all digits in password with *.
Count how many vowels are in the name.
Convert name to title case (first letter capital).
Display all information in a formatted string like:
"Name: John Doe | Email: gmail.com | Mobile: 9876543210"

 */

public class CustomerDataValidator {

	public static void main(String[] args) {
		String customerName = "Mihir Prasad Bhuyan";
		String customerEmail="mihirprasad94@gmail.com";
		String customerMobNumber="7008262302";
		String password="Mihir@1994";
		
		//Check if email contains '@' and '.'.
		if(customerEmail.contains("@") && customerEmail.contains(".")) {
			System.out.println("The email contains @ and .");
		}else {
			System.out.println("Invalid format of the email.");
		}
		
		//Extract domain name from email (e.g., from abc@gmail.com → gmail).
		
		int startingIndexOfDomain=customerEmail.indexOf("@")+1;
		int lastIndexOfDomain=customerEmail.indexOf(".");
		String Domain=customerEmail.substring(startingIndexOfDomain,lastIndexOfDomain);
		System.out.println("The Domain is "+Domain);
		
		//Validate mobile number (must be 10 digits).
		if(customerMobNumber.length()==10) {
			System.out.println("valid Mobile number.");
		}else {
			System.out.println("Invalid mobile number.");
		}
		
		//Check if password contains at least one uppercase, one lowercase, one digit, and one special character.
		char[] charsOfPassword=password.toCharArray();
		
		for(char ch:charsOfPassword) {
			
		}

	}

}
