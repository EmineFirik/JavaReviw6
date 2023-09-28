package com.neotech.review04;

public class Sinop {
public static void main(String[] args) {
	
	
	Village village1=new Village();
	
	village1.name="Huseyin Bey";
	village1.papulation= 12345;
	village1.house=20;
	village1.mayar="Emine Firik";
	
	village1.good();
	village1.mosk();
	village1.school();
	
	Village village2=new Village();
	village2.name="Tansa";
	village2.papulation=123;
	village2.house=23;
	village2.mayar="Dincer Firik";
	
	village2.good();
	village2.mosk();
	village2.school();
	
	City city1=new City();
	
	city1.name="Ayancik";
	city1.papulation=12345;
	city1.mayor="Munevver Ozturk";
	
	
	city1.beatiful();
	city1.monthain();
	
	
	
	
	
	
	
	
	
	
}
}
