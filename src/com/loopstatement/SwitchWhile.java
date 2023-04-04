package com.loopstatement;

import java.util.Scanner;

public class SwitchWhile {
	public static void main(String[] args) {
		SwitchWhile.K1();
		
	}
	
	// multiple opration using switch with while//
	static void K1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no");
		int num=sc.nextInt();
		System.out.println("1.factorial 2.evenodd 3.prime 4.fibnaciseries");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		
		/*case 1:{
			int i=num; int fact=1;
			while(i>=1) {
				fact=fact*i;
				i--;
			}
			System.out.println("factoral="+fact);
			
			
		}*/
		case 1:{
			int i=1; int fact=1;
					while(i<=num) {
						fact=fact*i;
						i++;
					}
					System.out.println("factorial="+fact);		
		}
		case 2:{
			int i=1;
			while(i<=num) {
				if(num%2==0) {
					System.out.println("even no="+num);
				}
				else {
					System.out.println("odd ="+num);
				}
				
			}
			
			
		}
		
		
		
		}
		
	}
}
