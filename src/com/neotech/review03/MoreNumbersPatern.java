package com.neotech.review03;

public class MoreNumbersPatern {
public static void main(String[] args) {
	
	//1
	//22
	//333
	//4444
	
	for( int row=1; row<=4; row++) {
		for( int col=1; col<=row; col++) {
			System.out.print(row);
			
		}
		System.out.println();
		
	}
	
	//1111
	//222
	 //33
	 //4
	
	for( int row1=1; row1<=4; row1++) {
		for( int col1=4; col1>=row1; col1--) {
			System.out.print(row1);
		}
		System.out.println();
	}
	
	
	
	
	
}   
}  
