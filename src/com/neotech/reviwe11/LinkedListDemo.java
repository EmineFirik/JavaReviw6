package com.neotech.reviwe11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		List<String >asia=new LinkedList();
		
		
		asia.add("Taivan");
		asia.add("Japone");
		asia.add(0, "Singapor");
		asia.add("Turkiye");
		asia.add("Japone");
		System.out.println(asia);
		
		
		
		List<String >asia3=new LinkedList();//create emty list
		
		Iterator <String>it=asia.iterator();
		while( it.hasNext()) {
			String country=it.next();
			if( asia3.contains(country)) {
				asia3.contains(country);
			}
		}
	System.out.println(asia3);
	}
	

}
