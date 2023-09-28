package com.neotech.review06;

public class USA {
	
	
	private String capital="DC";
	protected String mainState="NY";
	String bestState="CA";
	public String bestSchool="Neotech";
	
	
	private void SelectPresident() 
	{
		System.out.println("Selected president only with USA!");
	}
	
	
	protected void playNBA() 
	{
		System.out.println("There are US and Canada teams in the NBA");
	}
	public void speakEnglish() 
	{
		System.out.println("English is spoken everywhere!");
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		USA us=new USA();
		
		System.out.println();
		System.out.println("Public "+ us.bestSchool);
		System.out.println("default "+us.bestState);
		System.out.println("Protected "+ us.mainState);
		System.out.println("private "+us.capital);
		
		
		
		us.SelectPresident();
		us.speakEnglish();
		us.playNBA();
		
		
	}

}
