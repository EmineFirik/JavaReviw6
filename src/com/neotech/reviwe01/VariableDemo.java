package com.neotech.reviwe01;

public class VariableDemo {
	public static void main(String[] args) {

		//Declare a variable
		
		String firstName;
		//System.out.println("My first name is "+firstName);
		
		//Assign a valuue
		 firstName="Emine";
		System.out.println("My first name is "+ firstName);
		String lastName="Firik";
		
		double age= 41;
		
		System.out.println(firstName + " " +lastName + " " + age + " years old");
		System.out.println(firstName + " " +lastName + " " +( age +1) +" years old");
		
		
		// After 10m years
		
		age=age+10;
		System.out.println(age);
		//After getting married
		lastName= "Tuna";
		System.out.println(firstName +" "+ lastName );
		
		
	}

}
