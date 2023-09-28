package com.neotech.reviwe01;

public class Bus {
	
	String bus;
	String Busname;
	int koltuk;
	

	
	void kalkis() 
	{
		System.out.println(Busname+" everyday start 2am" );
		
	}
	void varis() 
	
	{
		System.out.println(Busname+ " everyday arival 5pm");
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		Bus bus1=new Bus();
		bus1.bus="C430";
		bus1.Busname="Ford";
		bus1.koltuk=46;
		
		System.out.println(bus1.bus+" "+ bus1.Busname+ " has a "+ bus1.koltuk+ " capacity");
		
		bus1.kalkis();
		bus1.varis();
		
		
		
		
	}
	
}