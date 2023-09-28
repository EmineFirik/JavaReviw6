package com.neotech.review04;

public class Task {
public static void main(String[] args) {
	
	
	int [][] numbers= { 
			{4,6,7,},
			{8,9,10},
			
			
	};
	int biggestNum=0;
	for( int i=0; i< numbers.length; i++) {
		for( int j=0; j<numbers[i].length; j++) {
			if ( numbers[i][j]>biggestNum) {
				biggestNum=numbers[i][j];
			}
		}
	}
	System.out.println("Biggest numbers is -->"+ biggestNum);
	
	
	
	
	
	
}
}
