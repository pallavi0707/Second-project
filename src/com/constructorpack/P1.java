package com.constructorpack;

public class P1 {
	P1(){
		this(10);
		System.out.println("no parameter");
	}
	P1(int a){
		this(0.05f,12.2d);
		System.out.println("single parameter");
	}
	P1(int a, float b){
		this();
		System.out.println("double parameter int and float");
	}
	P1(float b,double c){
		System.out.println("double para float and double");
		
	}
	public static void main(String[] args) {
		P1 p=new P1(10,0.05f);
	}

}
