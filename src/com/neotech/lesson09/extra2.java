package com.neotech.lesson09;

import java.util.ArrayList;
import java.util.List;

public class extra2 {
	public static void main(String[] args) {
		
		
		List<Integer> nums=new ArrayList<>();
		
		nums.add(10);
		nums.add(10);
		nums.add(10);
		nums.add(10);
		nums.add(10);
		int sums=0;
		for( Integer numbers: nums) {
			sums=sums+ numbers;
		}
		System.out.println("The sum is ->"+sums);
	}

}
