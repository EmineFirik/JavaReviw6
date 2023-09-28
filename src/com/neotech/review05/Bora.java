package com.neotech.review05;

public class Bora {
	
	void  addTwoNumbers()
	{
		int result= 3+2;	
		
	}
	
	void addTwoNumbers( int a, int b) 
	{
		int result= a+b;
	}
	int  addTwoNumbesr() 
	{
		int result=3+2;
		return result;
	}
	int addTwonum(int num1, int num2) 
	
	{
		int result=num1+num2;
		return result;
	}
	
public static void main(String[] args) {
	
Bora b= new Bora();
	b.addTwoNumbers();
	b.addTwoNumbers(3, 2);
	int res1 = b.addTwoNumbesr();
	System.out.println(res1);
	int res=b.addTwonum(7, 5);
	System.out.println(res);
	
	if ( res==12) {
		System.out.println("God Job Bora");
	}else {
		System.out.println("I still love you");
	}
	
	
	
}
}
