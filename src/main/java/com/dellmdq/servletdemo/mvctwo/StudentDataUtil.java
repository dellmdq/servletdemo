package com.dellmdq.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		//create empty list
		List<Student> students = new ArrayList<>();
		//add sample data
		students.add(new Student("Erik","Public","erikdell@jsp.com"));
		students.add(new Student("Marce","Palacios","mpala@jsp.com"));
		students.add(new Student("Milton","Friedman","miltonfriedman@jsp.com"));
		
		//return the list
		return students;
			
	}
	
}







