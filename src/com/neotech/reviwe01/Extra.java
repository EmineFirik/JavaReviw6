package com.neotech.reviwe01;

import java.util.Scanner;

public class Extra {
	public static void main(String[] args) {


		//*
		//**
		//***
		//*****
		
		for ( int i=5; i>0; i--) {
			for ( int j=5; j>i; j--) {
				
				System.out.print("*");
			}
			System.out.println();
			
			for( int k=1; k<= 5; k++  )  {           
				for( int b=5; b>=k; b--) {
					System.out.print("*");
				}
				System.out.println();
			}                                       //****
			                                        //***
			                                        //**
			                                        //*
			
			
		}
		
	}
}