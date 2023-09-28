package com.neotech.reviwe10;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		
		try {
		int []number= {1,2,3,4,};
		for( int i=0; i< 9; i++) {
			System.out.println(number[i]);
		}
		
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		try {
			int[] numbers = new int[3];
			numbers[0] = 10;
			numbers[1] = 10;
			numbers[2] = 10;
			numbers[3] = 10;
			numbers[4] = 10;
			numbers[5] = 10;

		} catch (Exception e) {
			System.out.println("There is a out of bound exception " + e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Neotech academy is the best");
		}
		System.out.println("Continue code execution");
	}
}