package com.neotech.reviwe10;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		dividion(8,2);
		dividion (5,0);
		dividion(20,6);
	}
	
	
public static void dividion( int num1, int num2) {
	try {
	int result= num1/num2;
	System.out.println("The result is ->"+result);
	
}catch (Exception ae) 
	{
	System.out.println(ae);
	System.out.println(ae.getMessage());
	ae.printStackTrace();
}finally {
	System.out.println("Neotech is the best");
}

}
}
