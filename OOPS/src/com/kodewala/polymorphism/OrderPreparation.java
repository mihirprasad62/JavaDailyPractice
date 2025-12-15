package com.kodewala.polymorphism;

//parent class Food Item

class FoodItem{
	public void prepareFood() {
		System.out.println("preparing food item.");
	}
}


//child class preparing order for pizza

class Pizza extends FoodItem{
	@Override
	public void prepareFood() {
		System.out.println("preparing pizza");
	}
}


//child class preparing order for burger

class Burger extends FoodItem{
	@Override
	public void prepareFood() {
		System.out.println("preparing burger");
	}
}


public class OrderPreparation {

	public static void main(String[] args) {
		//reference of parent class
		FoodItem foodItem;
		foodItem=new Pizza();
		foodItem.prepareFood();
		
	}

}
