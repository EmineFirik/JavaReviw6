package com.neotech.lesson09;

public class Person {
	
	public String name,lastName;
	public int age,salary;
	
	
	Person(String name, String lastName,int age, int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
		
	}
	public void personInfo() {
		System.out.println(name+ " "+lastName+ " "+ age+" " +salary);
	}

}
