package com.kodewala.stringmethod.usecaseone;

public class StringMethodClassWork {

	public static void main(String[] args) {
		String str1="Mihir Prasad Bhuyan";
		
		for(int i=0;i<str1.length();i++) {
			//System.out.print(str1.charAt(i)+" ");
		}
		
		String str2="mihirprasad94@gmail.com";
		String domainName=str2.substring(str2.indexOf("@")+1,str2.lastIndexOf("."));
		System.out.println(domainName);
		
		System.out.println(str1.replaceAll(" ", "_"));
		
		String str3="Mihir Prasad Bhuyan";
		
		String[] str4=str3.split(" ");
		
		for (String item:str4) {
			System.out.println(item);
		}
		
		

	}

}
