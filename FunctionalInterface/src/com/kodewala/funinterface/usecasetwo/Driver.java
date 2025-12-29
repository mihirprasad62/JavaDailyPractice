package com.kodewala.funinterface.usecasetwo;

@FunctionalInterface
interface OperationOnNumbers{
	boolean isOddEven(int inputNum);
}

public class Driver {

	public static void main(String[] args) {
		//lambda expression for functional interface
		OperationOnNumbers num1=(int x)->{
			return x%2==0;
		};
		
		boolean result=num1.isOddEven(6);
		
		//print
		if(result) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}

	}

}
