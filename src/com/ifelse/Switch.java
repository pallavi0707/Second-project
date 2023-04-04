package com.ifelse;
                            ///multiple operation addition substraction
import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	M1();
}

static void M1() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter num1");
	int num1=sc.nextInt();
	System.out.println("enter num2");
	int num2=sc.nextInt();
	System.out.println("1.Addition 2.Subtraction 3.multiplication 4.division");
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:
		System.out.println("add="+(num1+num2));
		
	case 2:
		System.out.println("sub="+(num1-num2));
	
	case 3:
		System.out.println("mul="+(num1*num2));
	
	case 4:
		System.out.println("div="+(num1/num2));
	
		default:
			System.out.println("invalid choice");
		
	}
	}
	
}




