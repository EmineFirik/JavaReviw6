package com.neotech.review06;

public class Task1 {
	public static void main(String[] args) {
		
		String longStr="I am very happy because its a weekend";
		
		char[]array= longStr.toCharArray();
		
	for( int i=0; i< array.length; i++) {
		if( array[i]=='a') {
			System.out.print('e');
		}else {
			System.out.print(array[i]);
		}
	}
	}
}
