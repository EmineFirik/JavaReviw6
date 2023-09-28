package com.neotech.reviwe07;

public class Phone {
	
	private  String phoneNumber;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSeralNumber() {
		return seralNumber;
	}
	public void setSeralNumber(String seralNumber) {
		this.seralNumber = seralNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private String seralNumber;
	private String  brand;
	
	
	Phone(String phoneNumber ,String seralNumber,String  brand){
		this.phoneNumber=phoneNumber;
		this.seralNumber=seralNumber;
		this.brand=brand;
	}
	public void displayInfo() {
		System.out.println("This phone number has  "+ brand+ " phone.");
	}

}
