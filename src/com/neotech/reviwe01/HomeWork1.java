package com.neotech.reviwe01;

public class HomeWork1 {
	public static void main(String[] args) {
		
		
		//Create a 2D array of integer type with 3 rows and 4 columns and print all values of the

		//whole array.
		
		int [][]nums= { 
				{2,4,5,6}, 
				{5,7,8},
				{6,8,9},
		};
		
		 
			for(int  i=0; i<nums.length; i++) {	
				for( int j=0; j<nums[i].length; j++) {
					System.out.print(nums[i][j]+" ");
					System.out.print(nums[i][j]+" ");
				}
				
			}
		
			
		
		

		//➔ Create a 2D array or integer type where you will store odd and even numbers in 3 rows

		//and 4 columns. Develop a program which will identify/print the even numbers only.
			
			int [][] numbers= {  
					{10,20,30,60},
					{20,40,40,50},
					{10,40,40,50},
					
			};
			
			int sum=0;
			for( int i=0; i<numbers.length; i++) {
				
				for( int j=0; j<numbers[i].length; j++) {
					if( numbers[i][j]%2==0) {
						
					}
					System.out.print(numbers[i][j]+" ");
				}
				
			}
			
			
		//➔ Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the

		//sum of all numbers.
		//
		int [][]array= {
				{ 10,20,30},
				{15,25,35 },
				{5,45,50},
				};
		int sums=0;
		for( int i=0; i<=array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				
				sums=sums+array[i][j];
			}
			System.out.println("The sum is "+sums);
		}
		
		
	}

}
