package com.neotech.review02;

public class Task3 {
	public static void main(String[] args) {
		//Add Even numbers
		//Also add Odd numbers
		//Also add All numbers
		//Between 1 && 20
		//Using for loop
		
		int sumEven=0;
		int sumOdd=0;
		int sum=0;
		
		for ( int num=1; num<=50; num++) {
			if (num%2==0) {
				sumEven=sumEven+num;
			}else {
				sumOdd=sumOdd+num;
			}
			sum=sum+num;
			
		}
		System.out.println("The sum of even numbers "+sumEven);
		System.out.println("The sum of even numbers "+sumOdd);
		System.out.println("The sum of even numbers "+sum);
		
	}
	
	
	
	

}
