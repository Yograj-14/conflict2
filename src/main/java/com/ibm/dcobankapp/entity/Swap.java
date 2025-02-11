package com.ibm.dcobankapp.entity;

public class Swap {
	public static void main(String[] args) {
		int a=100, b=200 ;
		
		System.out.println("before swaaping, a="+a+ "and b="+b);
//		int temp=a;
//		a=b;
//		b=temp;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swaaping, a="+a+ "and b="+b);
		
	}

}
