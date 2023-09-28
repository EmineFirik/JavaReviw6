package com.neotech.review04;

public class TwoDarrayIntro {
	public static void main(String[] args) {

		int[][] nums = { // 2D array

				
				{ 2, 8, 4 }, 
				{ 6, 6, 7 }, 
				{ 9, 5, -3 },
				{ 8, 1, 4 }, 
				};
System.out.println(nums[1][2]);
System.out.println(nums[3][2]);		


System.out.println("________________________");
		
		
for(int [] row:nums) {
	for( int element:row) {
		System.out.print(element+" ");
	}
	System.out.println();
}

//Print just one element

int [] row2=nums[2];
System.out.println(row2[2]);







	}

}
