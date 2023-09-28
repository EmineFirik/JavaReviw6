package com.neotech.interwev;

public class IQ4 {
	
public static void main(String[] args) {
	
	//Question4:
	//Find out how many alpha characters are present in a String?
	// Find number of words in string?
	
	
	//String is immutuble you need to re assig yeniden tanimlamak gerekiyor ummutuble oldugu icin yoksa degismez butun herseyi basar
	String str="dfg%^Df3434 ere @#67";
	
	
	str=str.replaceAll("[^a-zA-Z]", "");
	
	
	System.out.println(str);
	
	System.out.println("The number of alfa carecter is "+ str.length());
	
	String longStr = "bye bye Java hello Selenium";
	String []words =longStr.split(" ");
	System.out.println(words.length);
	
	for( String w:words) {
		System.out.println(w);
	}
}

}
