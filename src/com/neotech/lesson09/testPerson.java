package com.neotech.lesson09;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class testPerson {
	public static void main(String[] args) {
		
		
		Map<Integer,Person> list=new TreeMap<>();
		
		list.put(1, new Person("Emine", "Firik", 42, 650));
		list.put(2, new Person("Dincer", "Firik", 48, 780));
		list.put(3, new Person("Seray", "Firik", 10, 0));
		
		for( Entry<Integer,Person> entry: list.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue().name+" "+ entry.getValue().lastName);
		}
		
		
		
		
		}
	}


