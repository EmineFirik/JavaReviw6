package com.neotech.review06;

import java.util.Arrays;

public class ArrayParemeter {
	
	
	private int avarage (int [] array) {
		
		int sum=0;
		for ( int i=0; i<array.length; i++) {
			sum=sum+ array[i];
			
		
		
		}
		return sum/array.length;
	
	}

	public static void main(String[] args) {
		
		ArrayParemeter ar=new ArrayParemeter();
		int[]array= {1,5,6,7,9,};
		ar.avarage(array);
		System.out.println(ar.avarage(array));
	}

	public int largestNumber(int[] array) {
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
