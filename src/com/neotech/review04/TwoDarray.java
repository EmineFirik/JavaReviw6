package com.neotech.review04;

public class TwoDarray {
	public static void main(String[] args) {
		
		int [][]nums= {
				
				{3,9},
				{4,6,8,2},
				{7},
				
		};
		
		
		System.out.println(nums[1][3]);
		System.out.println(nums[2][0]);
		System.out.println("The number of rows->"+ nums.length);
		
		System.out.println("The length of row with index 1-> "+ nums[1].length);
		
		
		for( int row=0; row<nums.length; row++) {
			for( int col=0; col<nums[row].length; col++) {
				System.out.print(nums[row][col]+ " ");
			}
			System.out.println();
		}
		// Nested anhanced for loop
		for( int[] row:nums) {
			
			for(int  element:row) {
				System.out.println(element + " ");
			}
			System.out.println();
		}
		
	}

}
