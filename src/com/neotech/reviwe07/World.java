package com.neotech.reviwe07;

public class World {

	
	public static void main(String[] args) {
		
		//1st way using to constructor with no parameters
		Person p1 =new Person();
		p1.displayInfo();
		p1.name="Emine ";
		p1.age=42;
		p1.weight=120;
		
		p1.displayInfo();
		
		// Using to constructor with two parameters (String and int)
		Person p2 =new Person("Emine", 40);
		p2.weight=123;
		p2.displayInfo();
		
		
		
		Person p3=new Person("Dincer ",48);
		p3.displayInfo();
	}
}
