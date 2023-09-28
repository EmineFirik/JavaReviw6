package com.neotech.reviwe01;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
	//ASk the user to enter 2 numbers
	// Ask the user for the operator
	//Solve it using if else
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the first number");
		double d1=scan.nextDouble();
		
		System.out.println("Please enter the second number");
		double d2 =scan.nextDouble();
		
		System.out.println("Please enter the one operator ( -,+,*,/");
		String op=scan.next();
		
		if ( op.equals("+")) {
			System.out.println("The result is "+(d1+d2));
		}else if (op.equals("-"))
		{
			System.out.println("The result is "+(d1-d2));
		}
		else if ( op.equals("*")) {
			System.out.println("The result is "+(d1*d2));
		}
		
		else if (op.equals("/")) {
			System.out.println("The result is "+(d1/d2));
		}
		
		else {
			System.out.println("Invalid operator");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
