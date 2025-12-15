package com.kodewala.polymorphism.usecasethree.deliverytype;

public class ProcessDeliveryFee {
	public void processDeliveryFare(DeliveryService deliveryService,int _weight) {
		deliveryService.calculateDeliveryCharge(_weight);
	}

}
