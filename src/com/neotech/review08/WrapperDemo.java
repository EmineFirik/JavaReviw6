package com.neotech.review08;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int num1=5;
		
		//Integer integer1 =new Integer(num1);
		
		//Integer integer2=Integer.valueOf(num1);
		
		Integer integer1=new Integer(num1);//boksinng
		int num2=integer1.intValue();//unboxing
		
		//easy way
		int num3=8;
		Integer integer3=num3;// auto boxing
		int num4=integer3;
		
		
		
		byte num=1;
		Byte Byte1=num;
		System.out.println(num);
		
		//Double way wrapper
		Double d3=new Double (4.7);
		Double d4=4.7;
		double d5=d4;
		
		
		Long loong2=new Long(5l);
		
		loong2=5l;
		long d=loong2;
		
		
	}

}
