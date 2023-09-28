package com.neotech.reviwe07;


//OOp Object Oriented programming
//1.inheritance(Miras)
//2.Polymaorphism
//Abstraction
//Encapsulation
public class Doctor {
	
	String name;
	int salary;
	String licenId;
	
	//It is good practice to leave the default constructor
	Doctor()
	{
		super();
	}
	
	
	
	Doctor( String name, int salary, String licenceId)
	{
		this.name=name;
		this.salary=salary;
		this.licenId=licenId;
	}
	
	public  void checkUp(String name) 
	{
		System.out.println("Doctor "+ this.name+" makes a checkup on " + name);
	}
	
	

}
