package com.loopstatement;
                               // print A to Z using for loop
public class AtoZusingforloop {
public static void main(String[] args) {             //A=ASCII VALUE=65 Z=ASKEY VALUE=90
	System.out.println("----CAPITAL LETER");
	M1();

	System.out.println("----SMALL LETER");
	M2();
}
static void M1() {
	char c;
	for(c='A'; c<='Z'; c++) {
		System.out.println(c);
	}
}
	
	
	//print small a to z using for loop            //a=ASKEY VALUE=97 z=ASKEY VALUE=122

	static void M2() {
		char c;
		for(c='a'; c<='z'; c++) {
			System.out.println(c);
		}
}
}
