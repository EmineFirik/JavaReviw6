package com.neotech.reviwe01;

import java.util.Scanner;

public class ExtraRepit {
	public static void main(String[] args) {

		Scanner scan= new Scanner (System.in);
		
		System.out.println("Please enter gender");
		
		char gender= scan.next().charAt(0);
		
		System.out.println("are you rich or not");
		
		boolean rich=scan.nextBoolean();
		if( gender=='F') {
			System.out.println("It is a girl");
			
			if( rich) {
				System.out.println("Buy LV bag");
			}else {
				System.out.println("read a book");
			}
			
			
		}else if( gender=='M') {
			System.out.println("It is a girl");
			
			if ( rich) {
				System.out.println("Buy ferrari");
			}else {
				System.out.println("Play soccer");
			}
		}
		
		
		
	}

}
