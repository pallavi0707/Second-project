package com.ifelse;            //more than two comparision

import java.util.Scanner;

public class IfElseifdemo {
	public static void main(String[] args) {
		Demo();
	}
	
	static void Demo() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second no");
		int num2=sc.nextInt();
		System.out.println("enter third no");
		int num3=sc.nextInt();
		System.out.println("enter fourth no");
		int num4=sc.nextInt();
		if(num1>num2 && num1>num2 && num1>num3 && num1>num4 ) {
			System.out.println("num1 is greater");
			}
		else if(num2>num1 && num2>num3 && num2>num4) {
				System.out.println("num2 is greater");
				
			}
		else if(num3>num1 && num3>num2 && num3>num4) {
			System.out.println("num3 is greater");
		}
		else if(num4>num1 && num4>num2 && num4>num3) {
			
		}
		else {
			System.out.println("all no are equal");
		}
		}
	

}
