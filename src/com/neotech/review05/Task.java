package com.neotech.review05;

public class Task {
	
	

	// Create a method sayGreetingwithNumber that accepts
	// the greeting and how many times it should be printed
	
	void sayGreeting (int n) 
	
	{
		for ( int i=1; i<=n; i++) {
			System.out.print("Hello ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Task m=new Task();
		m.sayGreeting(10);
	}

}
