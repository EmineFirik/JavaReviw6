package com.neotech.interwev;

public class IQ6 {
	
	public static void main(String[] args) {
		
		
		//Question6
		//Write a Java Program to find whether a String is palindrome or not?
		
		String original="kayak";
		//First way reversing the string
		
		String reversed=IQ5.reverseOne(original);
		System.out.println(original+ " "+reversed);
		
		if( original.equals(reversed)) {
			System.out.println(original+ " is a palendrome");
		}else {
			System.out.println("Is not palendrome");
		}
		
	}

}
// Scanner scanner = new Scanner(System.in);
////System.out.print("Enter a string: ");
//String input = scanner.nextLine();

//if (isPalindrome(input)) {
    //System.out.println("The string is a palindrome.");
//} else {
   // System.out.println("The string is not a palindrome.");
////}

//scanner.close();
//}



