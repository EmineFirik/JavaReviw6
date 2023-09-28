package com.neotech.interwev;

import java.util.Arrays;

public class IQ7 {
	
	public static void main(String[] args) {
		
		
		
		//Question7
		//Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?
		
		int [ ]numbers= {1,25,5,90,-1,89,74,25,100};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("smal is "+ numbers[0]);
		
		System.out.println("Biggest is "+ numbers[numbers.length-1]);
		
		System.out.println("second biggest  is "+ numbers[numbers.length-2]);
		
	}

}
