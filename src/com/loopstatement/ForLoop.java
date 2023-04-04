package com.loopstatement;

import java.util.Scanner;

public class ForLoop {
public static void main(String[] args) {
	ForLoop.M1();
	//ForLoop.M2();
	//M3();
}

//to display 1 to 100 in reverse oder and divisible by 4
   static void M1() {
	   for(int i=100;i>=1;i--) {
		   if(i%4==0)
		   System.out.println("reverse ="+i);
	   }
	   
	System.out.println("---------------------------------");
}
   
   //to display user series
   static void M2() {
	   Scanner sc= new Scanner (System.in);
	   System.out.println("enter your no.");
	   int num=sc.nextInt();
	   for(int i=1;i<=10;i++) {
		   System.out.println("user series="+num*i);
		   
	   }
   }
   
   static void M3() {
	   char c;
	   for( c='A'; c<='Z'; c++) {
		   System.out.println(c+" ");
		   
	   }
   }





}
