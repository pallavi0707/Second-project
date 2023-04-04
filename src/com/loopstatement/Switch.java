package com.loopstatement;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	Switch.H();
	
}
//multiple operation using switch//

	static void H() {
		Scanner sc= new Scanner(System.in);
		int num1,a=0,b=1,c; int fact=1;
		System.out.println(" Enter your no ");
		 num1=sc.nextInt();
		System.out.println("1.EvenOdd 2.Prime 3.factorial 4.fibonaciseris ");
		System.out.println("----Enter your choice ----");
		int choice=sc.nextInt();
		switch(choice) {
           case 3:{
			
			for(int i=1; i<=num1; i++) {
				fact=i*fact;
			}
			System.out.println("factorial="+fact);
		}
		break;
		case 4:{
			for(int i=1; i<=num1; i++) {
				System.out.println("series="+a);
				c=a+b;
				a=b;
				b=c;
				
			}
			
		}
		case 1: {
			if (num1%2==0) {
				System.out.println("-Even no-");
			}
			else {
				System.out.println("-Odd no-");
			}
			break;
		}
		case 2:{
			if(num1==2 || num1==3 || num1==5) {
				System.out.println("--prime no--");
					}
			else if(num1%2>0 && num1%3>0) {
				System.out.println("--prime no--");
			}
			else {
				System.out.println("--Not prime no--");
			}	
			break;
		}
		
		}
	}
}
		
		
	

