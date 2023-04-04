package com.ifelse;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	 //EvenOdd.M1();
	 EvenOdd.M2();
}
static void M1() {                   
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int num=sc.nextInt();
	if(num%2==0) {                                         //with curly bracket
		System.out.println("this is even no");
		
	}
	else {
		System.out.println("this is odd no");
	}
	
}

static void M2() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int num=sc.nextInt();
	if(num%2==0)                //without curly bracket
		System.out.println("even no");   //only one statement we can write after if condition
		
	else                                //multiple statement we can write in else part
		System.out.println("odd no");
	System.out.println("end of pg");
}


}
