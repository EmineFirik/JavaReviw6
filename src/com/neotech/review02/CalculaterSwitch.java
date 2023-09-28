package com.neotech.review02;

import java.util.Scanner;

public class CalculaterSwitch {
	public static void main(String[] args) {
		
		//Ask the user to enter 2 numbers
		
		//Ask the user for the operator
		
		//Solve it using switch case
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter the first number");
		double d1=scan.nextDouble();
		
		System.out.println("Please enter the second number");
		double d2 =scan.nextDouble();
		
		System.out.println("Please enter the one operator ( -,+,*,/");
		String op=scan.next();
		double result=0;
		switch(op) {
		
		case "+":
		result=d1+d2;
		break;
		
		case "-":
			result=d1-d2;
			break;
			
		
		case "*":
			result=d1*d2;
			break;
			
		
		case "/":
			result=d1/d2;
			break;
			
			default:
			System.out.println("Invalid operator");
			break;
			
		
		
		}
		
		System.out.println("The result is "+ result);
		
		
		
		
		
		
		
	}

}
