package com.neotech.lesson09;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestStudentt {
	
	public static void main(String[] args) {
		
		
		
		Map <String,Studentt> student=new TreeMap<>();
		student.put("First", new Studentt("Emine", "E345"));
		student.put("Second", new Studentt("Seray", "S345"));
		student.put("Thrd", new Studentt("Mustafa", "m345"));
		
		for( Entry<String,Studentt> info:student.entrySet()) {
			String C=info.getKey();
			Studentt S=info.getValue();
			System.out.println(C+": "+ S.studentID+": "+ S.studentName);
		}
		
		
	}

}
