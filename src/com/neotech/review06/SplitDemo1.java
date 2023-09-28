package com.neotech.review06;

public class SplitDemo1 {
	public static void main(String[] args) {
		
		String longstr="I am very happy today because its a weekend";
		
		String [] array =longstr.split("today");
		
		System.out.println(array.length);
		
		for ( int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		System.out.println("__________________");
		
		longstr= "I like number 5 and 6 because 7 ate 9";
		
		String [] stringArray=longstr.split("[5-7]");
		
		System.out.println(stringArray.length);
	}
}
