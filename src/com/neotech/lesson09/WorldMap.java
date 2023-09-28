package com.neotech.lesson09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorldMap {
	public static void main(String[] args) {
		
		Map<String, String> europe=new TreeMap<>();
		europe.put("France", "Paris");
		europe.put("Belgium", "Brussels");
		europe.put("Spain", "Madrid");
		System.out.println(europe);
		
		
		Map<String,String>africa=new LinkedHashMap<>();
		
		africa.put("Kenya", "nairobi");
		africa.put("Egypt", "Kairo");
		africa.put("Tunissia", "Tunus");
		
		System.out.println(africa);
		
		Map <String,String> asia=new HashMap<>();
		asia.put("Chine", "Beijing");
		asia.put("Taivan", "Taipei");
		asia.put("Turkey", "Ankara");
		System.out.println(asia);
		
		
		List<Map<String,String>>world=new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);
		System.out.println("World ->"+ world);
		System.out.println(world.size());
		
		
	/////////////////////////////////////	
	Map<String,String>map2=world.get(2);
	System.out.println(map2);
	
	
	//Iterator to world
	for(Map<String, String>  continent:world) {
	Set<String> key	=continent.keySet();
	for( String count:key) {
		System.out.println(count + " > "+continent.get(count));
	}
	
	
	
	}
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	}

}
