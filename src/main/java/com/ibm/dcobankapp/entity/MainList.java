package com.ibm.dcobankapp.entity;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainList {

	public static void main(String[] args) {
//		ArrayList<String>people=new ArrayList<>();
//
//		people.add("john");
//		people.add("Dave");
//		people.add("Jane");
//		people.add("Wane");
//		System.out.println(people);
//		people.remove("Dave");
//		people.remove(1);
//		System.out.println(people);
////		
//		if(people.contains("john")) {
//			System.out.println("john is present");
//		}
//		if(people.isEmpty()) {
//			System.out.println("The list is Empty");
//		}
//		people.clear();
//		System.out.println(people);
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
//		list.remove(0);
//		list.remove(Integer.valueOf(3));
		list.clear();
		list.offer(2);
		list.offer(4);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list.poll());
		System.out.println(list);
		list.clear();
	}
	

}
