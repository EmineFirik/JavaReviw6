package com.neotech.review04;

import java.util.Scanner;

public class Scanner2Darray {
	
	public static void main(String[] args) {
		//Ask to user How many rows do you want in the array?
		// Ask the nuser How many colums do you want in the array?
		
		
		//Create the array String names
		
	
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("How many rows do you want in the array?");
		int rows=input.nextInt();
		
		System.out.println("How many colums do you want to in the array");
		int cols=input.nextInt();
		
		String[][]names= new String[rows][cols];
		
		//Fill the array	
		
		for( int i=0; i<rows; i++) {
			for( int j=0; j<cols; j++) {
				
			System.out.println("Please enter a name:");	
			names[i][j]=input.next();
			}
		}
		
		//Print the array
		//I will print using enhanced /advanced loop
		for(String [] row:names) {
			for(String name:row) {
				System.out.println(name+" ");
			}
			System.out.println();
		}
		
		
	}

}
