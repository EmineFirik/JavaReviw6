package com.neotech.lesson09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
		// HW1 iterate Europe by getting key;

		Map<String, String> europe = new TreeMap<>();
		europe.put("France", "Paris");
		europe.put("Belgium", "Brussels");
		europe.put("Spain", "Madrid");

		Iterator<String> it = europe.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("Iterate Europe by getting key-->" + key);

		}
		System.out.println();
		
		
		// HW2 iterate Africa by getting values;

		Map<String, String> africa = new LinkedHashMap<>();

		africa.put("Kenya", "Nairobi");
		africa.put("Egypt", "Kairo");
		africa.put("Tunissia", "Tunus");

		Iterator<String> it1 = africa.values().iterator();
		
		while (it1.hasNext()) {
			String value = it1.next();
			System.out.println("Iterator for the values--> " + value);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
      // HW3 Iterate Asia by getting entries
		
		Map<String, String> asia = new HashMap<>();
		asia.put("Chine", "Beijing");
		asia.put("Taivan", "Taipei");
		asia.put("Turkey", "Ankara");
		
		System.out.println("***Iterator by getting entries**");
		
		Iterator<Entry<String, String>> it3 = asia.entrySet().iterator();
		
		while (it3.hasNext()) {
			Entry entry = it3.next();
			System.out.println(entry);
		}

	}

}