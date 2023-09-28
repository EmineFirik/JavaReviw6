package com.neotech.reviwe10;

public class CheckedExceptionDemo2 {
	public static void main(String[] args) {
		
		System.out.println("Hiy Java");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			System.out.println("Something wrong while waiting");
		}
		
		System.out.println("Bay Java");
		
	}

}
