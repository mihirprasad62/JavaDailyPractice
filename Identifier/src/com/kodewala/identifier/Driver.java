package com.kodewala.identifier;

/* Bank Account System */

class BankAccount{
	//state of the class
	private String accountHolderName;
	private long accountNumber;
	private double accountBalance;
	
	//method to deposit amount
	public void depositAmount(double _amount) {
		System.out.println("BankAccount.depositAmount()");
	}
	
	//method to withdraw amount
	public void withdrawAmount(double _amount) {
		System.out.println("BankAccount.withdrawAmount()");
	}
}

/* Employee Pay roll system */

class EmployeePayRoll{
	//state of the class
	private String employeeId;
	private String employeeName;
	private double monthlySalary;
	
	//method to calculate annual salary
	
	public double calculateAnnualSalary() {
		this.monthlySalary=1000;
		return monthlySalary;
	}
}

/* Online Shopping Cart */

class ShoppingCart{
	//state of the class
	private int totalitems;
	private double totalPrice;
	
	//method for adding item to the class
	public void addItemToCart() {
		System.out.println("ShoppingCart.addItemToCart()");
	}
	
	//method for removing item to the class
	public void removeItemFromCart() {
		System.out.println("ShoppingCart.removeItemFromCart()");
	}
}

/* Student Management System*/

class StudentRecord{
	//state of the class
	private String nameOfTheStudent;
	private String rollNumber;
	private Short totalMarks=90;
	
	//method to check if the student is passed or not
	public Boolean isPassed() {
		System.out.println(totalMarks);
		return totalMarks>=40;
	} 
}

/* Hospital Appointment System */

class DoctorAppointment{
	//state of the class
	private String patientName;
	private String doctorName;
	private String appointmentDate;
	
	//method to schedule appointment
	public void scheduleAppointment() {
		System.out.println("DoctorAppointment.scheduleAppointment()");
	}
	
	//method to cancel appointment
	public void cancelAppointment() {
		System.out.println("DoctorAppointment.cancelAppointment()");
	}
}

public class Driver {
	public static void main(String[] args) {
		StudentRecord student=new StudentRecord();
		System.out.println(student.isPassed());
		
	}

}

/* when we create a instance of a class with the default constructor provided by compiler.by default the states of the class are null. */
