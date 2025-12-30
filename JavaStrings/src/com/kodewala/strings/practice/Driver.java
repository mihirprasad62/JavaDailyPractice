package com.kodewala.strings.practice;
/* Length and character access */
/* String Comparision */
/* Searching and Substring */

/* String Modification */
/* Splitting */
/* Checking String Content */

/* Conversions */
/* Concatination */

public class Driver {

	public static void main(String[] args) {
		
		/* Length and character access */
		
		String str1="Kodewala";
		System.out.println(str1.length());
		System.out.println(str1.charAt(0));
		
		/* String Comparision */
		String str2="Mihir";
		String str3="mihir";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		/* Searching and Substring */
		
		String str4="Mihir Prasad Bhuyan";
		System.out.println(str4.indexOf("M"));
		System.out.println(str4.lastIndexOf("a"));
		System.out.println(str4.substring(0));
		System.out.println(str4.substring(0,5));
		
		/* String Modification */
		String str5="Mihir Prasad Bhuyan";
		System.out.println(str5.toLowerCase());
		System.out.println(str5.toUpperCase());
		System.out.println(str5.trim());
		System.out.println(str5==str5.toUpperCase());
		System.out.println(str5.replace("M","B"));
		System.out.println(str5==str5.replace("M","B"));
		
		/* Splitting */
		
		String str6="Mihir Prasad Bhuyan Java full stack developer";
		String[] smallNames= str6.split(" "); //splitting based on comma
		System.out.println(smallNames);
		
		for(String name:smallNames) {
			System.out.println(name);
		}
		
		/* Checking String Content */
		String str7="I am from Bengalore I work as a Software engineer";
		System.out.println(str7.contains(" "));
		System.out.println(str7.startsWith("I"));
		System.out.println(str7.endsWith("ner"));
		
		/* Conversions */
		String str8="Mihir Prasad Bhuyan";
		char[] chars=str8.toCharArray();
		
		for(char c:chars) {
			System.out.println(c);
		}
		
		/* Concatination */
		
		String str9="Mihir";
		String str10=" Prasad";
		System.out.println(str9+str10);
		System.out.println(str9.concat(str10));
		
	}

}
