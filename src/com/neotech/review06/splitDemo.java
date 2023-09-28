package com.neotech.review06;

public class splitDemo {
	public static void main(String[] args) {
		
		String longstr="I am very happy today because its a weekend";
		
		String [] strArray= longstr.split("today");
		
		System.out.println(strArray.length);
		
		System.out.println("Printing using Enhanced loop");
		
		for( String element:strArray) {
			System.out.println(element);
			
			
			
			System.out.println("Printing normal loop");
			for( int i=0; i<strArray.length; i++) {
				System.out.println(strArray[i]);
				
				
				 longstr="I like numbers 5 and 6 because 7 ate 9. ";
				String []strArray1=longstr.split("[5-7]");{
				String []strArray2=longstr.split("[57]");	
					
					
					System.out.println(strArray1.length);
					
				}
				
			}
		}
	}
//Gozden gecir hepsini

}
