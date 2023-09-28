package com.neotech.reviwe01;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//Commenr shift O
		
		System.out.println("Please enter your first name");
		String firstName=scan.next();
		System.out.println("Please enter your last name");
		String lastName=scan.nextLine();
		System.out.println("Your full name is " +firstName + " "+ lastName);
		
		System.out.println("Please enter an int , boolean, double");
		int num=scan.nextInt();
		boolean b=scan.nextBoolean();
		double d=scan.nextDouble();
		
		System.out.println("Yuo entered "+ num+ " "+ b+ " "+d);
		
		System.out.println("---------------");
		
		
	}
	

}
