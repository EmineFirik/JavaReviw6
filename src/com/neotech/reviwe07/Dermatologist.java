package com.neotech.reviwe07;

public class Dermatologist extends Doctor {

	
	
	String dermID;
	
	Dermatologist()
	{
		
	}
	public void applySkin() 
	
	{
		System.out.println("Doctor "+name +" aply skin care. ");
	}
	 public static void main(String[] args) {
		 
		 Dermatologist der=new Dermatologist();
		 der.dermID="TUR34";
		 der.name="Dincer ";
		 der.checkUp("Seray");
		 
	}
}
