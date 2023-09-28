package com.neotech.review06;

public class ToCharArray {
	public static void main(String[] args) {
		
		
		String longStr="I am very happy today because its a weekend";
		
		
		//String [] array =longStr.split("today");
		//System.out.println(array.length);
		
		System.out.println(longStr.length());
		
		char [] charArray=longStr.toCharArray();
		
		System.out.println(charArray.length);
		
		for( int i=0; i<charArray.length; i++) {
			
			System.out.print(charArray[i]+"-");
		}
	}

}
