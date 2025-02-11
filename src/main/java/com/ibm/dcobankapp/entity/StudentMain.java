package com.ibm.dcobankapp.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class StudentMain {

	public static void main(String[] args) {
		ArrayList<Student>obj=new ArrayList<Student>();
		obj.add(new Student("Alise",34));
		obj.add(new Student("olo",312));

		obj.add(new Student("plise",3433));
		obj.add(new Student("lajdi",34444));
		obj.add(new Student("hudhu",341));
		Collections.sort(obj,Comparator.comparingInt(Student::getMarks));
		System.out.println(obj);
	}

}
