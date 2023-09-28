package com.neotech.review08;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		List <String >asia =new LinkedList<>();
		asia.add("Chine");
		asia.add("Japonya");
		asia.add("India");
		asia.add(1, "Korea");
		System.out.println(asia);
		
		System.out.println(asia.contains("Korea"));
		System.out.println(asia.isEmpty());
		System.out.println(asia.remove(0));
		List <String> asia2=new LinkedList <>();
		asia2.addAll(asia);
		System.out.println(asia2);
		
		for( int i=0;i< asia.size(); i++) {
			System.out.println(asia.get(i));
		}
		for( String country: asia) {
			System.out.println(asia);
		}
		Iterator<String>it=asia.iterator();
		
		while( it.hasNext()) {
			String country=it.next();
			System.out.println(country);
		}
		
		
	}

}
