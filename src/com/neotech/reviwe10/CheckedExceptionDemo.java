package com.neotech.reviwe10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
	public static void main(String[] args)  {
		
		String projectPath=System.getProperty("user.dir");
		String filepath=projectPath+"/Extra/democratic.xlsx";
		System.out.println(filepath);
		
		try {
			FileInputStream fis=new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("HappyEnding");
	}

}
