package com.neotech.reviwe11;

public class phone {
	
	private String SerialNumber;
	private String brand;
	private String password;
	
	phone( String SerialNumber,String brand, String password){
		this.brand=brand;
		this.password=password;
		this.SerialNumber=SerialNumber;
		
	}
	public void displayInfo() {
		System.out.println("The brand is "+ brand + " and serial number is "+ SerialNumber);
	}
	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
