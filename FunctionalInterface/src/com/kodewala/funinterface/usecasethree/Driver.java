package com.kodewala.funinterface.usecasethree;

interface StringLength{
	int findTheLengthOfString(String input);
}

public class Driver {

	public static void main(String[] args) {
		StringLength str= (String input)->input.length();

		System.out.println(str.findTheLengthOfString("Mihir Prasad Bhuyan"));
		
	}

}
