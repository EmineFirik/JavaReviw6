package com.neotech.review06;

public class task {
public static void main(String[] args) {
	
	
	String longStr="I am very happy today because its a weekend";
	
	
	char []charArray = longStr.toCharArray();
	
	System.out.println(charArray.length);
	
	for( int i=0; i<charArray.length; i++) {
		
		if (charArray[i]=='a') {
			charArray[i]='e';
		}
		System.out.print(charArray[i]+"|");
	}
}
	
	
}

