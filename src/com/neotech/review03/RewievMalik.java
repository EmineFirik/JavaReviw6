package com.neotech.review03;

import java.util.Scanner;

public class RewievMalik {
	public static void main(String[] args) {
		//Array size example
		
		int[] nums= {1,2,3};
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number of scores");
		int scoreNum=scan.nextInt();
		
		double[]scores=new double[scoreNum];
		
		for( int i=0; i<=scores.length; i++) {
			System.out.println(scores[i]);
			scores[i]=scan.nextDouble();
			
		
			
		}
			double max=scores[0], min=scores[0],avg,sum=0;
		for (int i=0; i<scores.length; i++) {
			
			sum=sum+ scores[i];
			if(scores[i]> max) {
				max=scores[i];
			}
			if(scores[i]<min) {
				min=scores[i];
			}
			
			
			
			
		}
		
		
		avg=sum/scores.length;
		
		System.out.println("Max "+ max+"min"+min+ "avarage"+ avg);
		
		
	}

}
