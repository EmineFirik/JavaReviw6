package com.neotech.review05;

public class methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	void sayWelcomeWithNumber(int n) 
	{
		for ( int i=1; i<=n; i++) {
			System.out.print("Welcome'");
		}
		System.out.println();
	}
	void sayGreeting(String greeting) 
	{
		for ( int i=1; i <=5; i++) {
			System.out.print(greeting+ " ");
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {

		methods m=new methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(2);
		m.sayWelcomeWithNumber(8);
		m.sayGreeting("Hola");
		m.sayGreeting("Merhaba");
	}
}
