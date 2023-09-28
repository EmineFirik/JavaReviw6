package com.neotech.reviwe07;

public class Person {

	//constructor method bu sekilde istedigin kadar da cogaltiyorsun
	//instance variables
	public String name;
	int age;
	protected int weight;
	
	//private String hairColor
	private String hairColor;
	
	public Person() 
	{
		System.out.println("I am the default");
	}
	
	public Person( String pName, int pAge) 
	{
		name=pName;
		age=pAge;
	}
	
	
	
	public void displayInfo() 
	{
		System.out.println("Name : "+ name+ " age: "+ age +" weight "+ weight+" "+hairColor);
	}
}
