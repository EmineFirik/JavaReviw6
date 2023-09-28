package com.neotech.lesson09;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
	
	public static void main(String[] args) {
		
		//HW2 iterate Africa by getting values;
		
		Map<String, String> africa = new LinkedHashMap<>();

		africa.put("Kenya", "Nairobi");
		africa.put("Egypt", "Kairo");
		africa.put("Tunissia", "Tunus");
		
		// Get Ierator for the values
		
		Iterator<String> it = africa.values().iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("Iterator for the values--> "+value);
		}
	}
}
