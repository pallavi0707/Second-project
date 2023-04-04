package com.loopstatement;

public class WhileLoop {
public static void main(String[] args) {
	WhileLoop .M1();
	WhileLoop.M2();
	
}

//print Even and prime number- 1-100 using while loop//

static void M1() {
	int i=1;                      //first initialization
	while(i<=100) {                //second condition
		
		if(i%2==0) {
	
		System.out.println(i);
		}
		i++;                       // third increment
		
	}
}
static void M2() {
	int i=1;
	while(i<=100) {
		if(i==2 || i==3 ||  i==5) {
			System.out.println("----prime number---"+i);
			
		}
		else if(i%2>0 && i%3>0 && i%5>0) {
			System.out.println("-----prime numer---"+i);
		}
		
		i++;
	}
	
}

}
