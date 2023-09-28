package com.neotech.lesson09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task7 {
	public static void main(String[] args) {
		
		Set<String> name=new TreeSet<>();
		name.add("Amerika");
		name.add("Ingiltere");
		name.add("Etiyopya");
		
		System.out.println(name);
		for(String el: name ) {
			System.out.println(el);
		}
		
		Iterator<String>it=name.iterator();
		while(it.hasNext()) {
		String ell=	it.next();
		System.out.println(ell);
		}
		
		Set<String> cities=new TreeSet<>();
		
		cities.add("Ankara");
		cities.add("Berlin");
		cities.add("Izmir");
		
		
	Iterator<String>it1	=cities.iterator();
		
		while( it1.hasNext()) {
			String city=it1.next();
			if( city.startsWith("A")) {
				it1.remove();
			}
		}
		
		System.out.println(cities);
	}
}