package com.ifelse;             

import java.util.Scanner;   //drawback of if else if -it will check line by line choice it does not directly switch to perticular choice

public class MultipleOperationifelseif {
public static void main(String[] args) {
	//check();
	switchdemo();
}
static void check() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter first no");
	int num1=sc.nextInt();
	System.out.println("enter second no");
	int num2=sc.nextInt();
	System.out.println("1.Addition 2.substraction 3.multiplication 4.division");
	int choice=sc.nextInt();
	if(choice==1) {
		System.out.println("addition="+(num1+num2));
	}
	else if(choice==2) {
		System.out.println("substration="+(num1-num2));
	}
	else if(choice==3) {
		System.out.println("multiplication="+(num1*num2));
	}
	else if(choice==4) {
		System.out.println("division="+(num1/num2));
	}
	else {
		System.out.println("envalid choice");
	}
}

//using switch case stetement//

       static void switchdemo() {
    	   Scanner sc= new Scanner(System.in);
    		System.out.println("enter first no");
    		int num1=sc.nextInt();
    		System.out.println("enter second no");
    		int num2=sc.nextInt();
    		System.out.println("1.Addition 2.substraction 3.multiplication 4.division");
    		int choice=sc.nextInt();
    		switch(choice) {
    		case 1:
    			System.out.println("addition="+(num1+num2));
    			break;
    		case 2:
    			System.out.println("substration="+(num1-num2));
    		case 4:
    			System.out.println("division="+(num1/num2));
    		case 3:
    			System.out.println("multiplication="+(num1*num2));
    			default:
    				System.out.println("invalid choice");
    		}
       }


}
