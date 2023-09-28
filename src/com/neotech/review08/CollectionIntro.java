package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIntro {
	public static void main(String[] args) {
		//List and interface
		
		//List <String >names=new List<>(); we an not create 
		
		List <String>africa=new ArrayList<>();
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Senegal");
		africa.add(0, "Congo");
		africa.add(1, "Tunus");
		System.out.println(africa);
		
		//2nd way of fiiling ArrayList
		List <String>africa2=new ArrayList<>();//Creating emty list
		africa2.addAll(africa);
		System.out.println(africa2);
		
		
		//3rd way to list
		List <String>africa3=new ArrayList<>(africa);
		System.out.println(africa3);
		
		for( int i=0; i<africa.size(); i++) {
			System.out.println(africa.get(i));
		}
		
		for( String element:africa) {
			System.out.println(africa);
		}
		
	Iterator<String>	it=africa.iterator();
	while( it.hasNext()) {
		String element=it.next();
		System.out.println(element);
	}
		
	}

}
