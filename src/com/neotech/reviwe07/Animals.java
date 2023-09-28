package com.neotech.reviwe07;

public class Animals {

	
	String name;
	int legs;
	
	
	Animals ( String name, int legs)
	
	{
		this.name=name;
		this.legs=legs;
	}
	public void sleep() 
	{
		System.out.println("All animals sleep.");
	}
	void disInfo() 
	{
		System.out.println(name+ " has "+ legs +" legs " );
	}
}
	



////New classsssssssssssssssssss

	  class Wolf extends Animals{
	
	
	public Wolf (String name, int legs )
	{
		super(name,legs);
	}
	}
	
	  
	//Newclass starttttttttttt
	
	class Fox extends Animals
	{
		
		String color;
		
	public 	Fox(String name, int legs, String color)
		{
			super(name, legs);
			this.color=color;
		}
	}
		///New classs start hereeeeeeeeeee
		
	class Bear extends Animals	{
		
		public Bear (String name, int legs) {
			super(name,legs);
		}

		public void roar() 
		{
			
		System.out.println("All bears roar");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
