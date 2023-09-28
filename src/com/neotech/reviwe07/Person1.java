package com.neotech.reviwe07;

public class Person1 {

	
	String name;
	String lastname;
	int age;
	int weight;
	
	Person1( )
	{
		System.out.println("Default");
	}
	
	 Person1(String name, String lastName, int age, int weight  )
	 {
		this.name=name;
		this.lastname=lastName;
		this.age=age;
		this.weight=weight;
	 }
	 
	 void displayInfo() 
	 {
		 System.out.println("Name->"+ name + " "+lastname+ " Age->"+age + " Weight->"+ weight); 
	 }
	public static void main(String[] args) {
		
		Person1 p=new Person1();
		p.name="Emine";
		p.lastname="Firik";
		p.age=24;
		p.weight=120;
		p.displayInfo();
		
		Person1 p2=new Person1("Dincer ", "Firik ", 24, 120);
		
		p2.displayInfo();
		
		
		
		
		
		
		
	} 
}
	 

