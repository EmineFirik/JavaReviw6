package com.neotech.lesson09;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Extra {
	
	public static void main(String[] args) {
		
		//print concotane sentes
		
		
		List<String> word=new LinkedList<>();
		
		
		word.add("Emine");
		word.add("is");
		word.add("not");
		word.add("in");
		word.add("the");
		word.add("Java Class today.");
		String output="";
		
		for(String con: word) {
			output=output+con+" ";
		}
		
		System.out.println(output);
	}

}
