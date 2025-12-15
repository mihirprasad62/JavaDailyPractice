package com.kodewala.polymorphism.usecasetwo;

public class Users {
	public static void main(String[] args) {
		ProcessTotalFareForRide totalFare=new ProcessTotalFareForRide();
		
		CarRide car=new CarRide();
		totalFare.totalFare(car, 50);
	}

}
