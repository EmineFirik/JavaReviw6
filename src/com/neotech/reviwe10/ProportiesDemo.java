package com.neotech.reviwe10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProportiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		String filePath= System.getProperty("user.dir")+"/Extra/Demo.properties" ;
		System.out.println(filePath);
		
		
		FileInputStream fileIS=new FileInputStream (filePath);
		
		Properties proper=new Properties();
		
		proper.load(fileIS);
		System.out.println(proper);
		
		Object firstName=proper.get("FirstName");//getProperty yazmak icin
		System.out.println(firstName);           //setProperty eklemek icin
		Object age=proper.get("Age");
		System.out.println(age);
		Object LastName=proper.get("LastName");
		System.out.println(LastName);
		proper.setProperty("SSN", "567-789-89-90");
		System.out.println(proper);
		
		proper.setProperty("Age", "67");
		System.out.println(proper);
		
		//Now let us save into a new file
		//the path to the new file
		String newPath= filePath+"/Extra/Demo.properties";
		FileOutputStream fos=new FileOutputStream(filePath);
		proper.store(fos, "Emine is very happy");
	}

}
