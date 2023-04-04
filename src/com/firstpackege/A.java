package com.firstpackege;

public class A {
	int a=10;
	static int b=20;
	{
		System.out.println("inside instnstance block");
		System.out.println("value of a="+a);
	}

	static {
		System.out.println("inside static block");
		System.out.println("value of b="+b);
		//A a1=new A();
		//System.out.println("value of a="+a1.a);
	}
	void M1() {
		System.out.println("instance methode");
	}
	static void M2() {
		System.out.println("static methode");
	}
	
	public static void main(String[] args) {
		B b1=new B();
		b1.N1();
	}
}
class B{
	int p=5;
	static int q=4;
	void N1(){
		A a1=new A();
		System.out.println("value of a="+a1.a);
		System.out.println("va;ue of b="+a1.b);
	}
	static void N2() {
		
	}
	
}
