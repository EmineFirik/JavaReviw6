package com.neotech.review06;

public class FamilyMember {

	String fulname;
	static String lastName;
	int age;
	String homeTown;
	
	
	void printFulName() 
	{
		System.out.println("Ful name is "+ fulname + " "+ lastName);
	}
	
	void printFamilyName() 
	{
		System.out.println("Family name is "+ lastName + " age is "+age);
	}
	void printHometown() 
	{
		System.out.println("The homeTown is "+ homeTown);
	}
	public static void main(String[] args) {
		
		
		FamilyMember fm=new FamilyMember();
		fm.fulname="Emine";
		fm.lastName="Firik";
		fm.age=42;
		fm.homeTown="Manisa Demirci";
		fm.printFulName();
		fm.printHometown();
		fm.printFamilyName();
		
		
		
		
		
	}
}
