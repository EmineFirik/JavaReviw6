package com.neotech.review03;

public class arrayIntro {
	public static void main(String[] args) {
		
		int []arr=new int[4];
		
		arr[2]=3;
		arr[1]=2;
		arr[0]=4;
		arr[3]=5;
		
		int sum=0;
		
		for(int i=0;i<arr.length; i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("The sum of the array is-> "+sum);
		
		//2nd way
		
		int[]arr2= {4,2,3,5};
		int sum2=0;
		for(int element:arr2 ) {
			
			sum2=sum2+element;
			
		}
		
		System.out.println("The sum is the number is -> "+ sum2);
		
	}

}
