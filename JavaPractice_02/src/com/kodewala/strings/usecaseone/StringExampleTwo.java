package com.kodewala.strings.usecaseone;

public class StringExampleTwo {

	public static void main(String[] args) {
		String s1="Kodewala";
		String s2="Kodewala";
		
		String s3=new String("Kodewala");
		String s4=new String("Kodewala");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));

	}

}
