package com.neotech.lesson09;

public class Studentt {
	
	public String studentName;
	public String studentID;
	
	Studentt(String studentName, String studentID)
	{
		this.studentName=studentName;
		this.studentID=studentID;
	}
	public void studentInfo() {
		System.out.println(studentName+ " "+ studentID);
	}

}
