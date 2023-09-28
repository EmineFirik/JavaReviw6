package com.neotech.reviwe11;

import java.util.ArrayList;
import java.util.Iterator;



public class WrapperList {
	
	public static void main(String[] args) {
		
		ArrayList <Integer>nums=new ArrayList();
		
		nums.add(2);
		nums.add(3);
		System.out.println(nums.size());
		for ( int i=0; i<nums.size(); i++) {
			Integer el=nums.get(i);
			System.out.println(el);
		}
		
		
		Iterator<Integer>it=nums.iterator();
		while( it.hasNext()) {
			Integer el=it.next();
			System.out.println(el);
		}
		nums.set(0, 9);
		System.out.println(nums);
	}

}
