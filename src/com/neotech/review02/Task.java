package com.neotech.review02;

public class Task {
	public static void main(String[] args) {
		//I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
		// but not 13th birthday, because we are scared
		// Let's use for loop
		
		
		for( int i=11; i<=20; i++) {
			if( i==13) {
				continue;
			}
			System.out.println(i+"Happy Birthday");
		}
		
		System.out.println("While loop");
		
		int age=10;
		while( age<20) {
			age++;
			if ( age==13) {
				continue;
			}
			System.out.println(age+"Happy Birthday");
			
			
		}
		
		for (int i =1; i<=10; i++) {
			
			System.out.println(i +" * "+i+" = "+(i*i));
		}
	}

}
