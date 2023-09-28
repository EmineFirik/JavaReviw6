package com.neotech.interwev;

public class IQ1 {
	public static void main(String[] args) {
		
		
		//question1
		// Write a program to swap 2 numbers without a temporary variable?
		// Swap 2 strings without a temporary variable?
		
		
		int a=3;
		int b=5;
		
		System.out.println("Before -> a="+ a+ " b="+b);
		//using a temprory variable;
		//int temp=b;
		
		//b=a;
		//a=temp;
		//System.out.println("a="+ a+ " b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap -> a="+ a+ " b="+b);
		
		System.out.println("------------------------");
		
		String str1="Java";
		String str2="Selenium";
		
		System.out.println("str1= "+ str1+" str2= "+str2);
		
		str1=str1+str2; //str1=JavaSelenium oldu
		System.out.println("str1= "+ str1+" str2= "+str2);
		
		
		str2=str1.substring(0, str1.length()-str2.length());// str2=Java oldu
		System.out.println("str1= "+ str1+ " str2= "+str2);
		
		str1=str1.substring(str2.length());//str1=Selenium oldu
		System.out.println("str1= "+ str1+ " str2= "+str2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
