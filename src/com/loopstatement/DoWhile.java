package com.loopstatement;

public class DoWhile {
	public static void main(String[] args) {
		DoWhile.N1();
		DoWhile.N2();
		
	}
	// print Even and prime 1-100 using do while loop//
	
	static void N1() {
		int i=1;             //Initialization
		do {
			if(i%2==0) {
		 System.out.println("--even no-> "+"  " +i);
			}
			i++;
		
		}while(i<=100);
		
		
		System.out.println("------------------------------");
	}
	
	static void N2() {
		int i=1;
		do {
			if(i==2 || i==3 || i==5) {
				System.out.println("--prime number-> "+" "+i);
				
			}
			else if(i%2>0 && i%3>0) {
				System.out.println("--prime number-> "+" "+i);		
			}
			
			i++;
			
		}while(i<=100);		
				
				
	}
	

}
