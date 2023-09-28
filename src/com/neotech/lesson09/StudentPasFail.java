package com.neotech.lesson09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentPasFail {
	public static void main(String[] args) {
		
		
Map<String,Integer> studentGradeMap=new HashMap<>();
		
		studentGradeMap.put("Emine", 95);
		studentGradeMap.put("Sertan", 58);
		studentGradeMap.put("Cihan", 82);
		studentGradeMap.put("June", 91);
		studentGradeMap.put("Yildirim", 71);
		studentGradeMap.put("Nur", 59);
		
		System.out.println("Student grade map ->"+studentGradeMap);
		
		//Passing grade is 70
		
		Map<String,Integer> passingStudent=new TreeMap<>();
		
		Map<String,Integer> failingStudent=new TreeMap<>();
		
		for( String studentName:studentGradeMap.keySet()) {
			
		Integer 	score=studentGradeMap.get(studentName);
		
		if( score>=70) {
			passingStudent.put(studentName, score);
		}
		else {	
			failingStudent.put(studentName, score);
		}		
}
		System.out.println(passingStudent);
		System.out.println(failingStudent);
		
		//Only for nur emre
		//do the same task using entry set
		
		for( Entry<String, Integer> entry:studentGradeMap.entrySet()) {
			if ( entry.getValue()>=70) {
				passingStudent.put(entry.getKey(), entry.getValue());
			}else {
				failingStudent.put(entry.getKey(), entry.getValue());
			}
		}
		
		System.out.println(passingStudent);
		
		System.out.println(failingStudent);
	}

}
