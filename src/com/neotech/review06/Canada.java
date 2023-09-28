package com.neotech.review06;

public class Canada {
	public static void main(String[] args) {
		
		USA us =new USA();
		System.out.println("Which variables can acces");
		
		System.out.println("Public-->"+ us.bestSchool);
		System.out.println("default-->"+us.bestState);
		System.out.println("Protected-->"+us.mainState);
		//System.out.println("Private-->"+ us.capitalCity); this is private you can not acces from other class
	
		
		us.speakEnglish();
		us.playNBA();
		
	}
}
