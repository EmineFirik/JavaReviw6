package com.neotech.reviwe01;

public class TypeCasting {
	public static void main(String[] args) {
		//byte < short < int < long(l) < float(f) < double
		
		int intNumber=34;
		
		//widening casting
		double doubleNumber=intNumber;//Automaticly
		System.out.println("intNumber" + intNumber);
		
		System.out.println(doubleNumber);
		
		
		//Narrowing
		byte byteNumber=(byte)intNumber;//Manuali
		
		System.out.println(byteNumber);
		//re assign
		intNumber=590;
		byte b2= (byte)intNumber;
		System.out.println(b2);
		
		byte emineAge=127;
		emineAge=(byte)(emineAge+1);byte b3=85;
		
		System.out.println(emineAge);
		
		byte b=85;
		int i =b;
		System.out.println(i);
		
		
		double d1=43.7;
		int  num=(int)d1;
		System.out.println(num);
		
		
		
		
	}

}
