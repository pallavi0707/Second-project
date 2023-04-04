package com.ifelse;

import java.util.Scanner;

public class ConditionalStetment {

	public static void main(String[] args) {
		//ifDemo();
		//System.out.println("-------------------------");
		//ifelse();
		ifelseM();
	}                       
	
	static void ifDemo() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>18)
			System.out.println("you are eligible for voting");
		System.out.println("you are not eligilible fo vote");
		System.out.println("end program");
	}
	
	static void ifelse() {                   //without culy bracet ifelse demo
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>18)                                       //  --- only one stmt we can write after if condiotn in without culy bracket
			System.out.println("you are eligible for voting");
		else
		System.out.println("you are not eligilible fo vote");
		System.out.println("end program");
	}
	
	static void ifelseM() {                         //ifelse with curly bracket
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("you are eligible for voting");
		}
		else {
		System.out.println("you are not eligilible fo vote");
		System.out.println("end program");
		}
	}
	
	
}
