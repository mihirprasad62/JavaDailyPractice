package com.kodewala.polymorphism.usecasetwo;
//Ride Booking Application

//parent class vehicle ride
class VehicleRide{
	//method to calculate fare
	public void calculateFare(double _distanceInKM) {
		double totalFare=_distanceInKM*10;
		System.out.println("Total fare is "+totalFare);
	}
}

//child class for bike ride

class BikeRide extends VehicleRide{
	@Override
	public void calculateFare(double _distanceInKM) {
		double totalFare=_distanceInKM*20;
		System.out.println("Total fare is "+totalFare);
	}
}
//child class for car ride
class CarRide extends VehicleRide{
	public void calculateFare(double _distanceInKM) {
		double totalFare=_distanceInKM*30;
		System.out.println("Total fare is "+totalFare);
	}
}

