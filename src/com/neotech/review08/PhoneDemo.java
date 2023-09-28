package com.neotech.review08;

public class PhoneDemo {

	public static void main(String[] args) {
		
		Phone p=new Phone("s1234","Iphone"," pas123");
		p.displayInfo();
		
		String serial=p.getSerialNumber("s1234");
		System.out.println("The serial number is "+serial);
		
		p.setSerialNumber("Aylin");
		System.out.println(p.getSerialNumber("Aylin"));
		
		p.setSerialNumber("s1234");
		System.out.println("The serial number " + serial);
		
		p.setBrand("Iphone");
		System.out.println(p.getBrand());
		
		
		
		
	}
	
}
