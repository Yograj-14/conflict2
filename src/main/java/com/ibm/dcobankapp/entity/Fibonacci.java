package com.ibm.dcobankapp.entity;

public class Fibonacci {

	public static void main(String[] args) {
//		int num1=0,num2=1,num=10;
//		for(int i=0;i<=num;i++) {
//			System.out.println(num1 +" ");
//			int num3=num2+num1;
//			num1=num2;
//			num2=num3;
//		}
		int num1=0,num2=1,num=10;
		for(int i=0;i<=num;i++) {
			System.out.println(num1+ " ");
			int num3=0;
			num3=num2+num1;
			num1=num2;
			num2=num3;
		}

	}

}
