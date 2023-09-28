package com.neotech.reviwe01;

public class Extra0 {
	public static void main(String[] args) {
		
		int [][]array= {
				
				{11,24,57,10	},
				{ 10,43,57,45  },
				{ 1,3,56,67  },
				
				
		};
	int large=0;
	int medium=0;
	int smal=0;
	
		for( int i=0; i<array.length; i++) {
			for( int j=0; j<array[i].length; j++) {
				if( array[i][j]>large) {
				large=array[i][j];	
				}else if ( array[i][j]<large&& array[i][j]>smal) {
					medium=array[i][j];
				}
				
				
			}
		}
		
		System.out.println("The large num "+ large);
		System.out.println("The medium "+ medium);
		System.out.println("The small "+smal);
		
		}	
	}
	
	

