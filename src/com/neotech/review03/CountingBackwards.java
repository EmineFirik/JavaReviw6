package com.neotech.review03;

public class CountingBackwards {
public static void main(String[] args) {
	//4321
	//4321
	//4321
	//4321
	
	for( int row=1; row<=4; row++) {
		for( int col=4; col>=1; col--) {
			System.out.print(col);
		}
		System.out.println();
	}
	System.out.println("_________");
	
	//4444
	//3333
	//2222
	//1111
	for( int row1=4; row1>=1; row1--) {
		for( int col1=1; col1<=4; col1++) {
			System.out.print(row1);
		}
		System.out.println();
	}
	
	
	
}
}
