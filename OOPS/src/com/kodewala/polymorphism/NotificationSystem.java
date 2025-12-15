package com.kodewala.polymorphism;

//parent class notification

class Notification{
	//method to send notification
	public void sendNotification() {
		System.out.println("sending notification");
	}
}

//child class emailNotification

class EmailNotification extends Notification{
	//method to send email notification
	@Override
	public void sendNotification() {
		System.out.println("sending email notification");
	}
}

//child class smsNotification

class SmsNotification extends Notification{
	//method to send sms notification
	@Override
	public void sendNotification() {
		System.out.println("sending sms notification");
	}
}

public class NotificationSystem {

	public static void main(String[] args) {
		Notification notification=new EmailNotification();
		notification.sendNotification();
	}

}
