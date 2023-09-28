package com.neotech.review08;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	
	
	public Student(String name) {
		this.name=name;
	}
	
	
	public void StudentInfo() {
		System.out.println("The student name is "+ name);
	}
	
}
public class StudentList {

	public static void main(String[] args) {
		
		ArrayList <Student >studentList=new ArrayList<>();
		
		//studentList.add("Emine");this is not posible
		
		studentList.add(new Student("Emine") );
		studentList.add(new Student ("Serya"));
		studentList.add(new Student ("Mustafa"));
		studentList.add(0,new Student ("Kemal"));
		System.out.println(studentList.size());
		System.out.println(studentList.addAll(studentList));
		
		//enhanced loop
		for(Student element:studentList ) {
			element.StudentInfo();
		}
		
		//Iterator 
	Iterator<Student>	it=studentList.iterator();
	while( it.hasNext()) {
		Student el=it.next();
		el.StudentInfo();
		
		
		
	}
	System.out.println("************");
	//for loop
	for( int i=0; i<studentList.size(); i++) {
		System.out.println(studentList.get(i));
		
	}
		System.out.println();
	}
	
}
