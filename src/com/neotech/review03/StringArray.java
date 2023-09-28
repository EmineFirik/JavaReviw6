package com.neotech.review03;

public class StringArray {
	public static void main(String[] args) {
		
		String[]animals= {"Dog' ", "Cat,", "Elephant"};
		for( int i=0; i<animals.length; i++) {
			
			System.out.print(animals[i]);
		}
		
		System.out.println();
		
		
		for(String element:animals) {
			System.out.print(element);
		}
		
		System.out.println();
		// Ask the user: How many numbers do you want to store in the array?
				// Ask him to enter the numbers: Read numbers and enter them into the array
				// Print the numbers from the array
		
		
	}

}
