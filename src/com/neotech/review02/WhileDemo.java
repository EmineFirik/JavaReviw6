package com.neotech.review02;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		//Ask to user enter 2 number
		//Ask to user enter operator
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter first number");
		int num=scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		
		System.out.println("Please enter one operator");
		char operator = scan.next().charAt(0);
			
		switch(operator)	{
		
		case '+':
		System.out.println(num+num2);
		break;
		
		case '-':
			System.out.println(num-num2);
			break;
		
		case '/':
			System.out.println(num/num2);
			break;
			
		case '*':
			System.out.println(num*num2);
			break;	
			
			default:
			System.out.println("Invalid operator");
		break;
		
		}
			
		System.out.println("The result is ");
		
	}

}
