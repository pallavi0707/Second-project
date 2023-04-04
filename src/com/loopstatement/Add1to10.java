package com.loopstatement;

public class Add1to10 {
public static void main(String[] args) {
	//M1();
	//M2();
	M3();
    M4();
   
}
//addition 1 to 10 number
static void M1() {
	int Add=0;
	for(int i=1; i<=10; i++) {
		Add=i+Add;
	}
	System.out.println(Add);
	
}

//addition of 1 to 50 number
static void M2() {
	int add=0;
	for(int i=1; i<=50; i++) {
		add=i+add;
	}
	System.out.println(add);
}
/// addition of even no bet 1 to 10
static void M3() {
	int add=0;
	for(int i=1; i<=10 ; i++) {
		if(i%2==0) {
			add=i+add;

		}
		
	}
	System.out.println(add);
}

static void M4() {
	int add=0;
	for(int i=1; i<=50; i++) {
		if(i%2==0) {
			add=i+add;
		}
	}
	System.out.println(add);
}






}
