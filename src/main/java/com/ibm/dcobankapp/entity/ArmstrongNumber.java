package com.ibm.dcobankapp.entity;

public class ArmstrongNumber {
	public static void main(String[] args) {
//		int sum = 0, a, b;
//		int num = 153;
//		b = num;
//		while (num > 0) {
//			a = num % 10;
//			num = num / 10;
//			sum = sum + (a * a * a);
//		}
//		if (b == sum) {
//			System.out.println(b + "is a armstrong number");
//		} else {
//			System.out.println(b + "is not a armstrong number");
//		}
//		int a=0,b,c;
//		int d=153;
//		c=d;
//		while(d>0) {
//			b=d%10;
//			d=d/10;
//			a=a+(b*b*b);
//			
//		}
//		if(c==a) {
//			System.out.println("it is a armstrong number");
//		}
//		else {
//			System.out.println("no");
//		}
//		int a=0,b,c;
//		int d=153;
//		c=d;
//		while(d>0) {
//			b
//			=d%10;
//			d=d/10;
//			a=a+(b*b*b);
//		}
//		if(c==a) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//		int a=0,b=1,c=10;
//		for(int i=0;i<=c;i++) {
//			System.out.println(a+" ");
//			int d=b+a;
//			a=b;
//			b=d;
//		}
//		int a=0,b=1,c=10;
//		for(int i=0;i<=c;i++) {
//			System.out.println(a+ " ");
//			int d=b+a;
//			a=b;
//			b=d;
//					
//		}
		int a=0,b,c;
		int d=153;
		c=d;
		while(d>0) {
			b=d%10;
			d=d/10;
			a=a+(b*b*b);
		}
		if(c==a) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}

//Create a class`Student`
//with properties like`name`and`marks`.
//Write a
//Java program
//that stores
//a list of`Student`
//objects in an`ArrayList`.
//Sort the
//list based
//on student
//marks in
//ascending order
//and display
//the sorted list