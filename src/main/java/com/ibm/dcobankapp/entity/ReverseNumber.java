package com.ibm.dcobankapp.entity;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=1234567;
		int b=0;
		int c=a;
		int d;
		while(a>0) {
			d=a%10;
			b=(b*10)+d;
			a=a/10;
			
		}
		System.out.println("revered number"+b);

	}

}
