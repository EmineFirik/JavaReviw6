package com.neotech.review04;

public class School {
	
	public static void main(String[] args) {
		
		
		Student student1=new Student();
		student1.name="Emine";
		student1.studentNr=23;
		student1.gradeLevel=12;
		System.out.println("The name of student "+student1.name);
		
		student1.study();
		student1.sleep();
		
		Student student2=new Student();
		student2.name="Dincer";
		student2.studentNr=25;
		student2.gradeLevel=11;
		System.out.println("The name of the student "+ student2.name);
		student2.study();
		student2.sleep();
		
		Teacher teacher1=new Teacher();
		teacher1.name="Saba";
		teacher1.salary=12.45;
		teacher1.subject="Java";
		teacher1.subject="Selenium";
		System.out.println("The name of teacher "+student1.name);
		teacher1.yellAtStudent();
		teacher1.teach();
		
		Teacher teacher2=new Teacher();
		teacher2.name="Elion";
		teacher2.salary=13.45;
		teacher2.subject="Java";
		teacher2.subject="Selenium";
		System.out.println("The name of teacher "+ teacher2.name);
		teacher2.yellAtStudent();
		teacher2.teach();
		
		
	}
	
	

}
