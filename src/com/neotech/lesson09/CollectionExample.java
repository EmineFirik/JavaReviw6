package com.neotech.lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		
		Set<Integer>numbers=new HashSet<>();
		numbers.add(34);
		numbers.add(67);
		numbers.add(32);
		numbers.add(12);
		numbers.add(36);
		numbers.add(78);
		System.out.println(numbers);
		
		Set<Integer>numbers1=new TreeSet<>();
		numbers1.add(34);
		numbers1.add(67);
		numbers1.add(32);
		numbers1.add(12);
		numbers1.add(36);
		numbers1.add(78);
		System.out.println(numbers1);
		
	Integer mim=	Collections.min(numbers);
	System.out.println(mim);
		
	Integer max= Collections.max(numbers);	
	System.out.println(max);
	
	List <Integer>numberList=new ArrayList<>(numbers);
		System.out.println(numberList);
	Collections.sort(numberList);
	System.out.println("after shorting "+ numberList);
	
	
	List<String >students=new ArrayList<String>();
	
	students.add("Emine");
	students.add("Dincer");
	students.add("Seray");
	students.add("Mesut");
	students.add("Nur");
	String list=Collections.min(students);
	System.out.println(list);
	
	String list2=Collections.max(students);
	System.out.println(list2);
	
	Collections.sort(students);
System.out.println("After short"+students );

int []arr={9,2,3,4,5};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));






	
	
	
	
	
		
	}
}
