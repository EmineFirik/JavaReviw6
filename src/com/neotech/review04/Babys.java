package com.neotech.review04;

public class Babys {
	
	//variables/atributes/properties
	
	String name;
	char gender;
	int weight;
	String hairColor;
	
	void talk ()
	{
	System.out.println("Baby is talking");	
		
	}
	void eat ()
	{
		System.out.println(" is eating");
	}
	void  cry ()
	{
		System.out.println(name+" is craying");
	}
	
	void displayInformayion() 
	{
		System.out.println("My name is "+ name);
		System.out.println("My gender is "+ gender);
		System.out.println("My hair color "+hairColor);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		//main name is world
		
		
		//Declaring and initilaazing a variable
		Babys baby1=new Babys();
		
		baby1.name="Emine";
		baby1.gender='F';
		baby1.weight=12;
		baby1.hairColor="Balck";
		
		 System.out.println("The name of baby is "+ baby1.name);
		 System.out.println("The babys hair color is "+ baby1.hairColor);
		baby1.talk();
		baby1.cry();
		baby1.talk();
		baby1.displayInformayion();
		
		Babys baby2=new Babys ();
		
		baby2.name="Dincer";
		baby2.gender='F';
		baby2.weight=6;
		baby2.hairColor="Brown";
		
		System.out.println("The nam of babys "+ baby2.name);
		System.out.println("The baby is hair color "+ baby2.hairColor);
		baby2.eat();
		baby2.cry();
		baby2.talk();
		baby2.displayInformayion();
		
		baby1.cry();
		baby2.cry();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
