package com.neotech.review06;

public class FamilyDemo {
	public static void main(String[] args) {
		
		FamilyMember.lastName="James";
		FamilyMember fm=new FamilyMember();
		fm.age=42;
		fm.fulname="Emine";
		fm.lastName="Firik";
		fm.printFamilyName();
		fm.printFulName();
		fm.homeTown="manisa demirci";
		System.out.println("__________________");
		
		FamilyMember fm2=new FamilyMember();
		fm2.age=48;
		fm2.fulname="Dincer";
		fm2.lastName="Firik";
		fm2.homeTown="manisa Demirci";
		fm2.printFamilyName();
		fm2.printFulName();
	}

}
