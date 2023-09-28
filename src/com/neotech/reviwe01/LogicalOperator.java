package com.neotech.reviwe01;

import java.util.Scanner;

public class LogicalOperator {
public static void main(String[] args) {
	
	
	
	
	//If you are a boy
	// If you are rich -- Buy a Ferrari
	// otherwise -- Play soccer
	// If you are a girl
	// If you are rich -- Buy a LV bag
	// otherwise -- Read a book
	// If you are none
	// Invalid gender
	
	//Scanner scan=new Scanner (System.in);
	
	//System.out.println("Please enter your gender");
	//char gender=scan.next().charAt(0);
//	System.out.println("Are you rich? (true /false");
	//boolean rich =scan.nextBoolean();
	
	//if (gender=='M' && rich) {
	///	System.out.println("BUy a ferrari");
	//}else if (gender=='M'&& !rich) {
	//	System.out.println("Play socker");
	//}else if (gender=='F' && rich) {
	//	System.out.println("Buy LV bag");
	//}else if( gender=='F' && !rich) {
	//	System.out.println("Read a book");
	//}else {
	//	System.out.println("Invalid gender");
	//}
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your gender F/M");
	
	char gender=scan.next().charAt(0);
	System.out.println("Are you rich or not");
	boolean rich=scan.nextBoolean();
	if( gender=='M'&&rich ) {
		System.out.println("Buy Ferrari");
	}
	else if ( gender=='M' && !rich) {
		System.out.println("Play socker");
	}else if ( gender== 'F'&& rich) {
		System.out.println("Buy LV bag");
	}else if ( gender=='F'&& !rich) {
		System.out.println("Read a book");
	}
	else {
		System.out.println("Invalid gender");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
