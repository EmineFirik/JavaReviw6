package com.neotech.lesson09;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task4 {
	public static void main(String[] args) {
		
		Map<String,String> countries=new TreeMap<>();
		
		countries.put("Turkiye", "Ankara");
		countries.put("Germany", "Berlin");
		countries.put("USA", "Washington");
		
	Iterator<String> it=	countries.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println("The key is-> "+ key);
		}
		System.out.println();
		
		Map<String,String> countri=new TreeMap<>();
		countri.put("Meksika", "MeksikaCity");
		countri.put("Venazuella", "Vena");
		countri.put("Brezilya", "Brez");
		
		Iterator<String> it2=countri.values().iterator();
		
		while( it2.hasNext()) {
			String value=it2.next();
			System.out.println("Iterater by the value-> "+ value);
		}
		System.out.println();
		
		
		Map<String,String> ulke=new TreeMap<>();
		
		ulke.put("Amerika", "USA");
		ulke.put("Almanya", "Germany");
		ulke.put("Ingiltere", "England");
		
		Iterator<Entry<String,String>>it4=ulke.entrySet().iterator();
		while( it4.hasNext()) {
		Entry ent=it4.next();
		System.out.println(ent);
		}
		
		
		
		
		
	}

	

}
