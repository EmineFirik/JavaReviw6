package com.neotech.review05;

public class StringMethods {
public static void main(String[] args) {
	
	String str="Pershendetje";
	
	System.out.println(str.length());
	System.out.println(str.isEmpty());
	System.out.println(str.isBlank());
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	
	System.out.println(str.charAt(1));
	System.out.println(str);//original is not change
	
	boolean equal=str.equals("PershendetBe");
	System.out.println(equal);
	System.out.println(str.equalsIgnoreCase("PershendetBe "));
	System.out.println("________________________");
	
	System.out.println(str.contains("SH".toLowerCase()));
	boolean starts=str.startsWith("per");
	System.out.println(starts);
	boolean end=str.endsWith("tje");
	System.out.println(end);
	String name ="Emine"+ "-"+ "Firik";
	System.out.println(name);
	
	
	System.out.println("__________________-");
	
	String str2="   Huseyin asked a question          ";
	
	System.out.println(str2.trim());
	System.out.println(str2.trim().length());
	
	String str3="Caglar Boss";
	char letter=str3.charAt(2);
	System.out.println(letter);
	
	System.out.println(str3.indexOf('a'));
	
	int index=str3.indexOf('a',2);
	
	System.out.println(index);
	
	
	
	
	
	
	
	
	
}
}
