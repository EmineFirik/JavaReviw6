package com.neotech.review06;

public class charArray {
	public static void main(String[] args) {
		
		String longStr="I am very happy today because its a weekend";
		
		System.out.println("long legth "+longStr.length());//kac harf var onu bulduk
		
		char []charArray = longStr.toCharArray();
		
		System.out.println("charlength "+charArray.length);
		
		// buradada ayni ikiside aynim isi yapiyor
		
		for( int i=0; i<charArray.length; i++) {
			System.out.print(charArray[i]+" |");
		}
	}

}
