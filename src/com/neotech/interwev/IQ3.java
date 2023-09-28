package com.neotech.interwev;

import java.util.Arrays;

public class IQ3 {
	public static void main(String[] args) {
		
		//Question3
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		//Fibonacci series: The next number is the sum of two previous numbers
		//You have to print -> 1,1,2,3,5,8,13,21,34,55...
		
		//1st way
		int num1=1;
		int num2=1;
		int next;
		
		for( int i=1; i<=15; i++) {
			System.out.print(num1+ ", ");
			next=num1+ num2;// find the next num
			num1=num2;//shift num1
			num2=next; //shift num2
			
			
		}
		System.out.println("\n_______________________________");
		//2nd way---------
		
		int a=1;
		int b=2;
		
		for( int i=1; i<=10; i++) {
			System.out.print(a+ ", ");
			//shift numbers
			b=b+a;
			a=b-a;
			
			
		
			
			
			
			
			
			
			
		}
		
	}

}
