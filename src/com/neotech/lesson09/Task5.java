package com.neotech.lesson09;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	public static void main(String[] args) {
		
		List <Integer> list=new ArrayList<>();
		
		list.add(5);
		list.add(10);
		list.add(5);
		
		
		int sum=0;
		for( Integer number: list) {
			sum=sum+ number;
		}
		System.out.println("The sum of the array list "+ sum);
	}

}
