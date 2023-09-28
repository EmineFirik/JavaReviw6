package com.neotech.reviwe11;

import java.util.ArrayList;

class student{
	String name;
	
	
	public student(String name) {
		this.name=name;
	}
	
	public void studentIno() {
		System.out.println("The student name is "+ name);
	}
	
}





public class StudentList {
	
	public static void main(String[] args) {
		ArrayList <student>studentlist=new ArrayList();
		
		student s1=new student("Emine");
		studentlist.add(s1);
		s1.studentIno();
		student s2=new student("Dincer");
		studentlist.add(s2)	;
		s2.studentIno();
		
		student s3=new student("Seray");
		studentlist.add(s3)	;
	s3.studentIno();
	System.out.println(studentlist.size());
	
	
	for( student el: studentlist) {
		el.studentIno();
	}
	
	
	
	
	
	
	
		
		
		
		
		
		
		}
		
		

		
	}


