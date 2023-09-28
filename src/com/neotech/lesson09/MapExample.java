package com.neotech.lesson09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapExample {
	private static final int TreeHashSet = 0;

	public static void main(String[] args) {
	//Map
		//HashMap,LinkedhashMap, TreeMap, HashTable
		Map <Integer,String>phoneList= new Hashtable<>();
		phoneList.put(201456, "Dincer Firik");
		phoneList.put(201488, "Kemal Firik");
		phoneList.put(201098, "Murat Firik");
		phoneList.put(201098, "Berkay Firik");
		phoneList.put(201456000, "Dincer Firik");
		
		
		
		phoneList.replace(201456, "Dincer");
		System.out.println(phoneList);
		
		String name=phoneList.get(201456);
		System.out.println(name+" is calling..... ");
		
		boolean contains=phoneList.containsKey(99999);
		System.out.println(contains);
		
		boolean conValue=phoneList.containsValue("Julia");
		System.out.println(conValue);
		
		
		phoneList.remove(201098);{
			System.out.println(phoneList);
			
			System.out.println(phoneList.size());
			
			
			//Lets get all the keys and store them in a Set
			System.out.println("phoneList key set");
			//Sett****************
			Set<Integer>numbers=phoneList.keySet();
			System.out.println(numbers);
			
		Iterator<Integer>	it=numbers.iterator();
			while( it.hasNext()) {
				Integer num=it.next();
				String personName=phoneList.get(num);
				System.out.println(personName +"-> "+num);
			}
			System.out.println("phoneList key value");
			//Collection****************************
			Collection<String>listname=phoneList.values();
			
			System.out.println(listname);
			
			for( String element:listname) {
				System.out.println(element);
				//Entry***************************************
			Set<Entry<Integer,String>>	entrys=phoneList.entrySet();
			System.out.println(entrys);
			System.out.println(phoneList);
			
			//using enhanced for loop or Iterator
			
			Set<Entry<Integer,String>>Entrys=phoneList.entrySet();
			for( Entry<Integer,String> names:Entrys) {
				Integer key=names.getKey();
				String value=names.getValue();
				System.out.println(key+ ": "+value);
			}
			
		Iterator<Entry<Integer,String>>	iti=Entrys.iterator();
		
		while( iti.hasNext()) {
			Entry<Integer,String>it1=iti.next();
			System.out.println(it1.getKey()+" *"+ it1.getValue());
		}
		
		
			}
			}
		}
		
		
		
		
		
		
		
		
	}

