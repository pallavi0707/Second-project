package com.ifelse;

import java.util.Scanner;

public class Demo {

	static void check() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int num;
		num=sc.nextInt();
		if(num%2==0 && num%10==0) {
			System.out.println("it is true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		Demo.check();
	}
}

