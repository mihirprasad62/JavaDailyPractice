package com.kodewala.funinterface.usecaseone;

@FunctionalInterface
interface OperationOnString{
	public abstract String changeToUppercase(String input);
}

public class Driver {

	public static void main(String[] args) {
		
		/*
		OperationOnString str=new OperationOnString() {
			@Override
			public  String changeToUppercase(String input) {
				return input.toUpperCase();
			}
		};
		
		*/
		
		//lambada expression for functional interface
		
		OperationOnString str= (String inputString)->inputString.toUpperCase();
		
		
		System.out.println(str.changeToUppercase("mihir ranjan"));
		

	}

}
