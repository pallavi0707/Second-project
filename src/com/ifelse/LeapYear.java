package com.ifelse;

import java.util.Scanner;

public class LeapYear {

	static void checkyr() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your year");
		int year;
		year=sc.nextInt();
		if(year%4==0) {
			System.out.println("this is leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}
	
	public static void main(String[] args) {
		LeapYear.checkyr();
	}
}
