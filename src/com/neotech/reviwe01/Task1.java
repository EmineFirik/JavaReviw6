package com.neotech.reviwe01;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		// Ask the user to enter 2 numbers
		
		// Ask the user for the operator
		//Solve it using if else
		
		
		Scanner scan =new Scanner(System.in);
		int num1;
		int num2;
		String op="+,-,/,*";
		
		
		System.out.println("Please enter first number");
		num1=scan.nextInt();
		System.out.println("Please enter second number");
		num2=scan.nextInt();
		System.out.println("Pleae enter one operator");
		op=scan.next();
		if(op.equals("+")) {
			System.out.println(num1+num2);
		}
		else if ( op.equals("*")) {
			System.out.println(num1*num2);
		}
		else if (op.equals("/")){
			System.out.println(num1/num2);
		}
		else if ( op.equals("-")) {
			System.out.println(num1-num2);
		}
		else {
			System.out.println("Invalid operator");
		}
	}
	
	
	
	
	
	
	
	
	

}
