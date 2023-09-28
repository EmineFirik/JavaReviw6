package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {
	
	public static void main(String[] args) {
		
	//	ArrayList <int >nums=new ArrayList<>(); this not posible
		
		ArrayList <Integer >nums=new ArrayList<>();
		
		boolean isEmty=nums.isEmpty();
		System.out.println("Is emty "+ isEmty);
		System.out.println("The size is "+nums.size());
		
		nums.add(new Integer(4));
		nums.add(5);
		System.out.println(nums.isEmpty());
		System.out.println(nums.size());
		
		
		boolean contains=nums.contains(4);
		System.out.println(contains);
		System.out.println("array list"+ nums);
		
		nums.remove(1);
		System.out.println(nums);
		//
		System.out.println("How can iterater array list");
		
		System.out.println("First way using for loop");
		System.out.println("Second way enhanced loop");
		System.out.println("Thisr way is iterator");
		
		for( int i=0; i<nums.size(); i++) {
			int element=nums.get(i);
			System.out.println(element);
		}
		
		for( int str: nums) {
			System.out.println(nums);
		}
		
		Iterator<Integer>it=nums.iterator();
		while(it.hasNext()) {
			Integer element=it.next();
			System.out.println(element);
			System.out.println(nums.set(0, element));
		}
		
	}

}
