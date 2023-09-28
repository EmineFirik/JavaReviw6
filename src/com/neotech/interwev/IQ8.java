package com.neotech.interwev;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IQ8 {
	
	public static void main(String[] args) {
		
		//// How can you remove all duplicates from ArrayList?
		
		List <String>names=new ArrayList<>();
		
		names.add("Emine");
		names.add("Emine");
		names.add("Alp");
		names.add("Dincer");
		names.add("Mesut");
		names.add("Seray");
		
		Set<String >set=new LinkedHashSet<>(names);
		//System.out.println(set);
		
		names.clear();
		names.addAll(set);
		System.out.println(set);
		
		System.out.println("---------------------");
		//2nd way
		
		//Before adding check if the elementnew list already contains the element
		
		List <String>names2=new ArrayList<>();
		names2.add("Emine");
		names2.add("Emine");
		names2.add("Alp");
		names2.add("Dincer");
		names2.add("Mesut");
		names2.add("Seray");
		//we create emty list
		List < String>names3= new ArrayList<>();
		for(String  name: names2) {
			
			
			if( !names3.contains(name)) {
				names3.add(name);
			}
			
		}
		System.out.println(names3);
	}

}
