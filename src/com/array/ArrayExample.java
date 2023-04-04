package com.array;

public class ArrayExample {
public static void main(String[] args) {
	int a[]=new int[5];    //declaration of array//array means collection of similar or homogenious datatypes
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
			
		//System.out.println("value="+a[0]);	
		//using for loop	
		/*for(int i=0; i<=4;i++)	{
			System.out.println("values="+a[i]);
		}*/
		
		//using for each loop
		for(int i:a) {              //intilize array in variable
			System.out.println(i);
		}
			
}

}
