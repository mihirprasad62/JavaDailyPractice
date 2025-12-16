package com.kodewala.datatypes;

/* E-Commerce Application*/

public class ProductDetails {
	//state of the class
	
	private String productId;
	private String productName;
	private int productPrice;
	private int availableQuantity;
	
	//constructor
	public ProductDetails(String _productName,int _productPrice,int _availableQuantity) {
		this.productName=_productName;
		this.productPrice=_productPrice;
		this.availableQuantity=_availableQuantity;
	}
	
	//method to display product details
	
	public void displayProductDetails() {
		System.out.println("Product name: "+productName);
		System.out.println("Product price: "+productPrice);
		System.out.println("Available Quantity: "+availableQuantity);
	}
	
	//entry of application
	
	public static void main(String[] args) {
		//instance of class ProductDetails
		ProductDetails product=new ProductDetails("Mobile",10000,5);
		product.displayProductDetails();
	}

}
