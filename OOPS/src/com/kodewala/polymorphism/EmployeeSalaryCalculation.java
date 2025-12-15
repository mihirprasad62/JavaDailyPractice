package com.kodewala.polymorphism;

//parent employee class
class Employee{
	public void calculateSalary() {
		System.out.println("The salary of the employee is 5000");
	}
}

//child class FullTimeEmployee

class FullTimeEmployee extends Employee{
	@Override
	public void calculateSalary() {
		System.out.println("The salary of the full time employee is 10000");
	}
}

//child class partTimeEmployee

class PartTimeEmployee extends Employee{
	@Override
	public void calculateSalary() {
		System.out.println("The salary of the part time employee is 1000");
	}
}

public class EmployeeSalaryCalculation {
	
	//entry point

	public static void main(String[] args) {
		//reference of parent class
		 
		 Employee emp;
		 emp=new FullTimeEmployee();
		 emp.calculateSalary();
		 emp=new PartTimeEmployee();
		 emp.calculateSalary();

	}

}
