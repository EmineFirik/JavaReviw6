package com.neotech.review08;

public class Phone {
	
	private String serialNumber;
	private String brand;
	private String pasword;
	
	
	public Phone(String serialNumber,String brand,String pasword ) {
		this.serialNumber=serialNumber;
		this.brand=brand;
		this.pasword=pasword;
	}
	
	public void displayInfo() 
	{
		System.out.println("This is a "+brand + "phone with serial number."+serialNumber);
		
	}
//getter ande setter

	public String getSerialNumber(String password) {
		String result =" ";
		if( this.pasword.equals(password)) {
			result =serialNumber;
		}else {
			result ="Acces Denied";
		}
		return result;
	}

	public void setSerialNumber(String serialNumber) {
		if( serialNumber.length()==7) {
			this.serialNumber=serialNumber;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
}
