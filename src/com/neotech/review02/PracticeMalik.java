package com.neotech.review02;

public class PracticeMalik {
public static void main(String[] args) {
	
	//calculate sumeven numbers beetwenn20 and 30
	int sumEven=0;
	int num=20;
	while( num<=30) {
		if (num%2==0) {
			sumEven=sumEven+num;
			System.out.println(num);
			
			
		}
		num++;
	}
	System.out.println("sum even numbers "+sumEven);
}
}
