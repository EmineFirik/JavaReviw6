package com.neotech.lesson09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	//collection
	//list
	//set
	//queue(Tree interface
	public static void main(String[] args) {
		
		Set<String>africaLinked= new LinkedHashSet<>();
		
		africaLinked.add("Morocco");
		africaLinked.add("Egypt");
		africaLinked.add("Senegal");
		System.out.println("Size-->"+ africaLinked.size());
		africaLinked.add("Egypt");
		System.out.println("Size-->"+ africaLinked.size());
		boolean add=africaLinked.add("Egypt");
		System.out.println(add);
		africaLinked.add("Kenya");
		System.out.println(africaLinked);
		
		
		Set<String>africahas=new HashSet<>();
		africahas.addAll(africaLinked);
		System.out.println(africaLinked);//if yo want you can order all
		
		Set<String>africaTree=new TreeSet<>();
		africaTree.add("Emine");
		africaTree.add("Can");
		africaTree.add("Ali");
		System.out.println(africaTree);
		System.out.println("**************");
		boolean contains=africaTree.contains("Turkiye");
		System.out.println(contains);
		boolean isEmty=africaTree.isEmpty();
		System.out.println(isEmty);
		
		africaTree.remove("Can");
		System.out.println(africaTree);
		//for loop dose not work set 
		for(int i=0; i<africahas.size(); i++) {
			System.out.println(africahas);
		}
		
		for( String africahsaa:africahas) {
			System.out.println(africahsaa);
		}
		
		System.out.println();
		
	Iterator<String>it	=africahas.iterator();
		while(it.hasNext()) {
			String  c=it.next();
			System.out.println(c);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
