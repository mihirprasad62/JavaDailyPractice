package com.kodewala.strings.usecaseone;

public class StringExampleFive {

	public static void main(String[] args) {
		
		String s1="Mihir";
		String s2=new String("Mihir");
		
		System.out.println(s1==s2);
		
		String s3=s2.intern();
		
		System.out.println(s1==s3);

	}

}
