package com.neotech.reviwe07;

public class Student {

	// instance variables
	String name;
	int age;

	// static class variables
	
	static  String school;
	
	Student ()
	{
		System.out.println("Default");
	}
	
	Student( String name, int age)
	{
		this.name=name;
		this.age=age;
		this.school=school;
	}
void info( ) 
{
	System.out.println("The student name->"+ name+ " Age: "+ age + " school :  "+ school);
}
public static void main(String[] args) {
	Student s=new Student();
	s.name="Emine";
	s.age=25;
	s.school="Neotech Academy";
	s.info();
	
	Student s1=new Student();
	s1.name="Dincer ";
	s1.age=41;
	s1.school="Neotech Academy";
	s1.info();
	school="Tesla";
	s1.info();
	
	
	
	
	
	
	
	
}


}
