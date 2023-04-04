package com.ifelse;

import java.util.Scanner;        //multiple operation using switch 

public class MultipleOperationswitchcase {
public static void main(String[] args) {
    check();
}

static void check() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your no");
	int num=sc.nextInt();
	System.out.println("1.evenodd 2.prime 3.factorial 4fibonaciseries");
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	
	case 1:
		if(num%2==0) {
			System.out.println("even no");
		}
		else {
			System.out.println("odd no");
		}
		break;
		
	case 2:
		if(num==2 || num==3 || num==5) {
			System.out.println("prime no");
		}
		
		else if(num%2>0 && num%3>0 && num%5>0) {
			System.out.println("prime no");
			
		}
		else {
			System.out.println("not prime");
		}
		break;
	case 3:
	int fact=1;
	for(int i=1; i<=num;i++) {
		fact=i*fact;
	}
	System.out.println("factorial="+fact);
	break;
	
default:{
	System.out.println("invalid choice");
}
		
	}
}
}
