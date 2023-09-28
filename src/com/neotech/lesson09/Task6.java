package com.neotech.lesson09;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task6 {
	
	public static void main(String[] args) {
		
		
		Map<String,Integer > employee=new TreeMap<>();
		
		employee.put("Emine", 250);
		employee.put("Dincer", 200);
		
		for( Entry<String,Integer> entry: employee.entrySet()) {
			String key=entry.getKey();
			Integer value=entry.getValue();
			
			if( value>200) {
				System.out.println(key+" =$"+value);
			}
			
			
			
		}
		
	}
}