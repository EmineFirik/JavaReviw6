package com.neotech.review05;

public class Task2 {
	
	void sayGreeting(String greeting ,int n) 
	{
		for ( int i=1; i<=n; i++) {
			System.out.print
			(greeting+ " ");
		}
		System.out.println();
		
		
		
	}
	void methodParameters( String name,int age, String lastName,String nationality) 
	{
		System.out.println("Ful name is "+name+" "+ lastName);
		System.out.println("My age is "+age);
		System.out.println("My nationalty->"+ nationality);
	}
	
		
	
public static void main(String[] args) {
	Task2 m=new Task2 ();
	m.sayGreeting("hello", 4);
	m.methodParameters("Emine", 41, "Firik", "Amerikan");
	
	
	
}
}
