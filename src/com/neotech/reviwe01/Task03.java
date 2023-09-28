package com.neotech.reviwe01;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		//ask the user to enter age
		//if age is from 1 to 3 --> you are a baby 
		// if age from 4-5 --> you are a toddler 
		//if age from 6-12•--> you are a kid
		// if age from 13-19 -->• teenager
		// if age >= 20 --> you are an adult
		
		
		//Scanner scan=new Scanner (System.in);
		//System.out.println("Please enter the age");
		//int age=scan.nextInt();
		///if ( age==1||age <=3) {
	//		System.out.println("You are a baby");
		//}
		//else if ( age==4||age==5) {
		//	System.out.println("You are todler");
		//}
		//else if ( age==13|| age<=19) {
		//	System.out.println("You are teenager");
		//}
		//else if ( age >=20) {
		//	System.out.println("You are adult");
		//}
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		String result="";
		
		if (age>=1&& age ==3) {
			result ="baby" ;     //System.out.println("You are a baby");
		}else if ( age <=4 && age<=5) {
			result="todler";
		}
		else if ( age >=6 && age<=12)	{
			result = "kid";
			
		}
		else if ( age >=13 && age<=20) {
			result = " teenager";
			
		}else if ( age >=20) {
			result="adult";
		}else {
			System.out.println("Invalid input");
		}
		System.out.println("You are a "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
