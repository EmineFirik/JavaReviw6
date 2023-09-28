package com.neotech.interwev;

public class IQ5 {
	public static void main(String[] args) {
		
		//question5
		//Write a java program to reverse a String? reverse  a string word by word?
		
		//1. Neotech -> hcetoeN
		//2. I love Java very much -> much very Java love I
		
		String str="Neotech";
		//1st one
		System.out.println(reverseOne(str));
		
		
		//2nd way
		System.out.println(reverseTwo(str));{
			
			
		//3rd way	
			StringBuffer sb=new StringBuffer(str);
			sb.reverse(); //String buffer is mutebla
			System.out.println(sb);
			
			
			System.out.println("------------------");
			String longStr=" bye bye Java hello Selenium";
			System.out.println(longStr);
			String []words=longStr.split(" ");
			
			String reverseSentence="";
			
			for ( int i=words.length-1; i>=0; i--) {
				reverseSentence+=words[i]+" ";
			}
			
			System.out.println(reverseSentence);
			
			
			
		}
		
	}
	public static  String  reverseOne(String str) {
		
		
		//1st way using charAt()
		String reverseStr="";
		for( int i=str.length()-1; i>=0; i--) {
			reverseStr += str.charAt(i);
		}
		
		return reverseStr;
		
		
	}
	public static String reverseTwo(String str) {
		String reverseStr="";
		char[] chArray=str.toCharArray();
		for( int i=chArray.length-1; i>=0; i--) {
			reverseStr+= chArray[i];
		}
		return reverseStr;
	}

}
