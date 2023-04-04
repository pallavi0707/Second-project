package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example2 {
public static void main(String[] args) {
	M1();
}
static void M1() {
	int A[]=new int[15];
	A[0]=1;
	A[1]=2;
	A[2]=3;		
	A[3]=4;		
	A[4]=5;	
	A[5]=6;
	A[6]=7;
	A[7]=8;
	A[8]=9;	
	A[9]=10;
	A[10]=11;
	A[11]=12;
	A[12]=13;
	A[13]=14;
	A[14]=15;	
		System.out.println("array"+A[10]);
		System.out.println("array list"+Arrays.toString(A));
		System.out.println("--------using for each loop------");
		for(int num:A) {
			if(num%2==0) {
				System.out.println("even no"+num);
			}
			
		}
		
		for(int num:A) {
			if(num%2!=0) {
				System.out.println("odd no="+num);
				
			}
			
		}
		System.out.println("---------using for loop---");
		int add=0;
			for(int num=1; num<=15;num++) {
				if(num%2==0) {
					add=num+add;
					
				}
				
				
			}
			
			System.out.println(add);
			
}







}
