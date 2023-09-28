package com.neotech.review02;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		//Ask the user to enter a positive number and add it to the total
		//He should enter 1 to stop -1 will not be added to the total
		
		Scanner scan=new Scanner (System.in);
		int num=0;
		int total=0;
		
		System.out.println("Please enter a positive number To Stop enter -1");
		num=scan.nextInt();
		
		while(num!=-1) {
			total=total+ num;
			System.out.println("Please enter a positive number To Stop enter -1");
			num=scan.nextInt();
		}
		
		System.out.println("Total = "+total);
		
		
		do {
			
			System.out.println("Please enter a positive number To Stop enter -1");
			num=scan.nextInt();
			total+=num;
		}while( num!=-1);
		
		System.out.println("Total= "+total);
		System.out.println("---------------------------");
		
		System.out.println("Please enter a positive number To Stop enter -1");
		num=scan.nextInt();
		for(int i=1; i<=5; i++) {
		System.out.println(i);	
			
			
			
		}
		
		
		
		
	}

}
