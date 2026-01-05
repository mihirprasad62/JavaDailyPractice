package com.kodewala.strings.usecaseone;

public class ReverseString {

	public static void main(String[] args) {
		String str="igi";
		
		String strReverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			strReverse+=str.charAt(i);
		}
		
		System.out.println(strReverse);
		
		
		//check if the string is palindrom or not
		
		if(str.equals(strReverse)) {
			System.out.println("The string is palindrom");
		}
		else {
			System.out.println("The string is not palindrom.");
		}
		
		

	}

}
