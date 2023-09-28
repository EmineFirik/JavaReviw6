package com.neotech.review05;

public class WithReturn {
	
	public static void main(String[] args) {
		
		String name= "Emine";
		int  length=name.length();
		System.out.println("The length of Emine "+length);
	WithReturn m=new WithReturn();
		boolean result=m.isOdd(8);
		System.out.println(result);
		boolean res=m.odd(8);
		System.out.println(res);
	}
	
boolean isOdd( int num) 
{
	boolean result;
	if ( num%2==1) {
		result =true;
	}else {
		result =false;
	}
	return result;
}

boolean  odd( int num){
	return num%2==1;
}


}
