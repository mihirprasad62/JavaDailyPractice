package com.kodewala.stringmethod.usecaseone;

public class StringMethodsHomework {

	public static void main(String[] args) {
		String str1="Mihir Prasad Bhuyan";
		String str2="IMG_12071994.jpg";
		//1.
		int vowelCount=0;
		char[] chars=str1.toCharArray();
		
		for(char ch:chars) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelCount+=1;
			}
		}
		System.out.println("The number of Vowels are "+vowelCount);
		
		//2.
		System.out.println(str1.contains("Mihir"));
		System.out.println(str2.startsWith("IMG_"));
		System.out.println(str2.endsWith(".jpg"));

	}

}
