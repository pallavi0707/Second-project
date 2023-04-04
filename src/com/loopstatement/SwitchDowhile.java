package com.loopstatement;

import java.util.Scanner;

public class SwitchDowhile {
	public static void main(String[] args) {
		SwitchDowhile .R1();
	}
	//multiple oertation using dowhile with switch/
	
	static void R1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your no");
		int num1=sc.nextInt(); boolean flag;
		do
		      {
						System.out.println("1.EvenOdd 2.Prime 3.Factorial 4.Fibnaciseries");
						System.out.println("Enter your choice");
						int choice=sc.nextInt();
						switch(choice) {
						
						case 1:{
							if(num1%2==0) {
								System.out.println("Even no");		
							}
							else {
								System.out.println("Odd no");
							}
							System.out.println("-------------------------");
						}
						break;
						case 2:{
								if(num1==2 || num1==3 ||  num1==5) {
									System.out.println("----prime number---");
									
								}
								else if(num1%2>0 && num1%3>0 && num1%5>0) {
									System.out.println("-----prime numer---");
								}
								else {
									System.out.println("----not prime---");
								}
							}
						break;
						
						case 3:{
							int i=1; int fact=1;
							while(i<=num1) {
								fact=fact*i;
								i++;
							}
							System.out.println("factorial="+fact);		
		                		}
						break;
							default: System.out.println("invalid choice");
						
						}
						System.out.println("do you want contineu");
						String msg=sc.next();
						if(msg.equalsIgnoreCase("y")) {
							flag=true;
						}
						else {
							flag=false;
						}
		System.out.println("-------------------------");
		}while(flag);
	}		

}      	




