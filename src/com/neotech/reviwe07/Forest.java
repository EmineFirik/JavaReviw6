package com.neotech.reviwe07;



public class Forest {
	
	public static void main(String[] args) {
		
		Wolf w=new Wolf("Wolf", 4);
		w.sleep();
		w.disInfo();
		
		
		Bear b=new Bear ("Bear", 4);
		b.disInfo();
		b.sleep();
		
		
		Fox f=new Fox("Fox", 4, "Orange");
		f.disInfo();
		f.sleep();
	}
}
