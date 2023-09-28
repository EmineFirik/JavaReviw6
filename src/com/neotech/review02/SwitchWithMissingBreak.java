package com.neotech.review02;

public class SwitchWithMissingBreak {
public static void main(String[] args) {
	int number =5;
	
	switch(number) {
	
	case 3:
	System.out.println("3 is correct");
	break;
	
	case 4:
		System.out.println("4 is correct");
		break;
		
	
	case 5:
		System.out.println("5 is correct");
		break;
		
	case 6:
		System.out.println("6 is correct");
		break;
		
	default:
	System.out.println("Invalid operator");
	break;
	}
	
	
}
}
