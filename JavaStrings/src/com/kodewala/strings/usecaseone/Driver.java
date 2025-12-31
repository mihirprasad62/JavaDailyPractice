package com.kodewala.strings.usecaseone;

/*
Problem Statement:

Write a Java program that takes a user’s full input string (like a paragraph or sentence) and performs various analyses.

Use Cases to Implement:

Find total number of characters (including spaces).
Find total number of words.
Count uppercase and lowercase letters separately.
Count number of digits.
Count number of spaces and special characters.
Replace all spaces with underscores (_).
*/


class FeedbackFromUser{
	//variables
	private String inputFromUser;
	
	//constructor
	FeedbackFromUser(String _input){
		this.inputFromUser=_input;
	}
	
	//method to process the input
	public void processInput() {
		
		/*Find total number of characters (including spaces).*/
		System.out.println("Total Number of Characters are"+inputFromUser.length());
		
		//Find total number of words.
		String[] words=inputFromUser.split(" ");
		System.out.println("Total Numbers of words are"+words.length);
		
		//Count uppercase and lowercase letters separately.
		int totalUppercaseCharCount=0;
		int totalLowercaseCharCount=0;
		int totalOtherCharacters=0;
		
		for(int i=0;i<inputFromUser.length();i++) {
			char ch=inputFromUser.charAt(i);
			if(Character.isUpperCase(ch)) {
				totalUppercaseCharCount+=1;
			}else if(Character.isLowerCase(ch)) {
				totalLowercaseCharCount+=1;
			}else {
				totalOtherCharacters+=1;
			}
			
		}
		
		System.out.println("Total Uppercase letters are "+totalUppercaseCharCount);
		System.out.println("Total lowercase letters are "+totalLowercaseCharCount);
		System.out.println("Total other characters are "+totalOtherCharacters);
		
		//Count number of digits.
		int totalDigitCount=0;
		for (int i=0;i<inputFromUser.length();i++) {
			char ch=inputFromUser.charAt(i);
			if(Character.isDigit(ch)) {
				totalDigitCount+=1;
			}
		}
		System.out.println("Total number of digits are:"+totalDigitCount);
		
		//Count number of spaces 
		
		String[] indivisualWords= inputFromUser.split(" ");
		int numberOfSpace=indivisualWords.length-1;
		System.out.println("Number of spaces are "+numberOfSpace);
		
		//Count special characters
		
		int totalSpecialCharCount=0;
		
		for(String eachWord:indivisualWords) {
			if(eachWord.contains("@") || eachWord.contains("#")) {
				totalSpecialCharCount+=1;
			}
			
		}
		
		System.out.println("Total special characters are "+totalSpecialCharCount);
		
		//Replace all spaces with underscores (_).
		System.out.println(inputFromUser.replace(" ", "_"));
		
	}
	
}
public class Driver {

	public static void main(String[] args) {
		FeedbackFromUser feedback=new FeedbackFromUser("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed neque turpis, sagittis eget nunc nec, lobortis vehicula urna. Donec eu nisi a orci mattis luctus vehicula eu felis. Vestibulum non justo quis est fermentum cursus id non elit. Aliquam sit amet sapien suscipit, ultrices lorem id, aliquet tellus. Duis porta.");
		feedback.processInput();
		

	}

}
