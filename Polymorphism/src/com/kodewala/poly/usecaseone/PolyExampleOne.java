package com.kodewala.poly.usecaseone;

class Person{
	void showRole() {
		System.out.println("I am a person with multiple roles");
	}
}

class Student extends Person{
	@Override
	void showRole() {
		System.out.println("I am a student.I study and attend classes.");
	}
}

class Boyfriend extends Person{
	@Override
	void showRole() {
		System.out.println("I am a boyfriend .I spend time with my patner.");
	}
}

public class PolyExampleOne {

	public static void main(String[] args) {
		//reference of type person pointing to different subclass object
		
		Person person;
		person=new Student();
		person.showRole();
		
		person=new Boyfriend();
		person.showRole();

	}

}
