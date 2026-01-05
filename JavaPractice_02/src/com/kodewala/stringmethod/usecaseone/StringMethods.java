package com.kodewala.stringmethod.usecaseone;

/* 
 * Length and character access
 * String comparision
 * Searching and Sub string
 * String Modification
 * Splitting
 * Checking String Content
 * Conversion
 * String Concatination
*/
public class StringMethods {

	public static void main(String[] args) {
		//Length and character access
		String str="Kodewala";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		
		//String comparision
		String str1="Kodewala";
		String str2="kodewala";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//Searching and Sub string
		String str3="Kodewala";
		System.out.println(str3.indexOf("a"));
		System.out.println(str3.lastIndexOf("a"));
		System.out.println(str3.substring(2));
		System.out.println(str3.substring(0,2));
		
		//String Modification
		String str4="  Kodewala   ";
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());
		System.out.println(str4.trim());
		System.out.println(str4.replace("K", "M"));
		System.out.println(str4.replaceAll(" ", "_"));
		
		//Splitting
		String str5="Mihir Prasad Bhuyan";
		String[] str6= str5.split(" ");
		System.out.println(str6[0]);
		System.out.println(str6[1]);
		System.out.println(str6[2]);
		
		//Checking String Content
		String str7="Mihir Prasad Bhuyan";
		System.out.println(str7.contains("P"));
		System.out.println(str7.startsWith("Mihir"));
		System.out.println(str7.endsWith("Bhuyan"));
		
		//Conversion
		String str8="Mihir Prasad Bhuyan";
		char[] chars=str8.toCharArray();
		
		for(char c:chars) {
			System.out.print(c+" ");
		}
		
		//String Concatination
		String str9="Mihir";
		String str10="Prasad";
		
		System.out.println(str9+str10);
		System.out.println(str9.concat(str10));
		
		

	}

}
