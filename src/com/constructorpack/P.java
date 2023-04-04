package com.constructorpack;

public class P {
public static void main(String[] args) {
	B b1=new B(10.0d,12.2d);
}
}

class A{
	A(){
		this(0.05f);
		System.out.println("no parameter");
	}
	
	A(float b){
		System.out.println("single parameter float");
	}
	
}

class B extends A{
	B(int a){
		super();                         //super calling statement is used for calling the constuctor of parent class
		System.out.println("single parameter int");
	}
	B(double b,double d){
		this(10);                      //this calling statement is used for calling the constructor of toch class 
		System.out.println("double para double and double");
	}
	
}
