package com.kodewala.polymorphism.usecasethree.deliverytype;

//parent class delivery service
class DeliveryService {
	// method to calculate delivery charges
	public void calculateDeliveryCharge(int _weight) {
		int deliveryCharge = _weight * 10;
		System.out.println("Delivery charge is " + deliveryCharge);
	}
}

//child class standard delivery

class StandardDelivery extends DeliveryService{
	//method to calculate delivery charge
	public void calculateDeliveryCharge(int _weight) {
		int deliveryCharge = _weight * 20;
		System.out.println("Delivery charge is " + deliveryCharge);
	}
}

//child class express delivery

class ExpressDelivery extends DeliveryService{
	//method to calculate delivery charge
	public void calculateDeliveryCharge(int _weight) {
		int deliveryCharge = _weight * 30;
		System.out.println("Delivery charge is " + deliveryCharge);
	}
}