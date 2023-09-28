package com.neotech.interwev;

public class IQ2 {
	
	public static void main(String[] args) {
		
		//Question 2
		//Write a java program to check whether a given number is prime or not?
		//Check if a number is divisible by any of smaller numbers. Use the mod operator.
		
		//prime number is a number that is greater then1 
		//Number 1 is not prime
		//prime number is divisible only by 1 and itself ornek 7 bir e bolunur 7 ye bolunur
		
		
		int number= 2;
		
		boolean prime=true;
		if( number==1) {
			prime=false;
		}else {
			for( int i=2;i<number; i++) {
				if( number %i==0) {
					System.out.println(number + "is divisible by "+ i);
					prime=false;
					break;
				}else {
					System.out.println(number +" is not divisible by i" );
				}
			}
		}
		System.out.println(number + "is prime "+ prime);
	}
	
	
	

}
