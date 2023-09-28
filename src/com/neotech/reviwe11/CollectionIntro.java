package com.neotech.reviwe11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIntro {
	public static void main(String[] args) {
		
		
		List<String >names=new ArrayList();
		
		names.add("Morocco");
		names.add("Kenya");
		names.add("senegal");
		names.add(0, "Kongo");
		
		
		
		System.out.println(names);
		//2nd way of fiiling an ArrayList
		
		List<String >names2=new ArrayList();
		names2.addAll(names);
		System.out.println(names2);
		
		for( int i=0; i< names2.size(); i++) {
			System.out.println(names2);
		}
		for( String  element: names2) {
			System.out.println(element);
		}
		
		Iterator<String>it=names2.iterator();
		while( it.hasNext()) {
		String el=	it.next();
		System.out.println(el);
		}
		
		
		
		
		
		
		
	}

}
