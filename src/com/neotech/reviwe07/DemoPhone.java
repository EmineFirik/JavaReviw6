package com.neotech.reviwe07;

public class DemoPhone {
	public static void main(String[] args) {
		
		Phone p=new Phone("234 567 789", "S456788", "Apple");
		p.displayInfo();
		
		String brand=p.getBrand();
		System.out.println("The set brand is "+brand);
		
		String pnoneNumber=p.getPhoneNumber();
		System.out.println("The set phone number is "+pnoneNumber);
		
	String serialNumber=p.getSeralNumber();
	System.out.println("The serial number is "+ serialNumber);
		
		
	}

}
