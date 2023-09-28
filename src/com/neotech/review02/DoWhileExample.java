package com.neotech.review02;

public class DoWhileExample {
public static void main(String[] args) {
	
	System.out.println("Similatities between while and do while");
	
	int age=1;
	while( age<=10) {
	System.out.println("Happy Birthday you are "+age+ "years old");
	age++;
	}
	System.out.println("-------------");
	
	int age2=1;
	
	do {
		
		System.out.println("Happy Birthday you are "+age2+ "years old");
		age2++;
		
		
	}while(age2<=10);
	
	
	boolean hot =true;
	
	while(!hot) {
		
		System.out.println("While loop");
		
		
		
	}
	
	do {
		System.out.println("Do while");
	}while(!hot);
	
	
	
	
}
}
