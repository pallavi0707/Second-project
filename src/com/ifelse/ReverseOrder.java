package com.ifelse;

public class ReverseOrder {
public static void main(String[] args) {
	//rverse();
	//add();
	capital();
}

static void rverse() {
	
	for(int i=100;i>=1;i--) {
		if(i%2==0) {
		System.out.println("reverse order"+"  "+i);
		
		
	}
	}
}
	
	static void add() {
		int add=0;
		for(int i=100;i>=1;i--) {
			add=i+add;
			
		}
		System.out.println("addition="+add);
}


	static void capital() {
		char c;
		for(c='A'; c<='Z'; c++) {
			System.out.println(c);
			
		}
		}
		






}
