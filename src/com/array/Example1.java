package com.array;

import java.util.Arrays;

public class Example1 {
public static void main(String[] args) {
	int p[]=new int[10];
	p[0]=1;
	p[1]=2;
	p[2]=3;
	p[3]=4;
	p[4]=5;
	p[5]=6;
	p[6]=7;
	p[7]=8;
	p[8]=9;
	p[9]=10;
	System.out.println("array="+p[4]);
	System.out.println("aray list=="+Arrays.toString(p));
	
	
	System.out.println("--------using for loop-----");
	//using for loop
	for(int num=1;num<=10;num++) {
		if(num%2==0)
		System.out.println("even number="+num);
		
	}
	
	System.out.println("-----using for each loop-----");
	//using for each loop                     //  for eah loop mainly used to fetch the value from collection like array//
	for(int num:p) {            //inistilize array variable
		if(num%2==0) {
			System.out.println("even no="+num);
		}
			
	}
}
}
