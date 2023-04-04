package com.firstpackege;

public class P {
public static void main(String[] args) {
	P2 p2=new P2();
	p2.M1();
}

}
class P1{
	int a=10;
    static int b=20;
    void M1() {
    	
    	System.out.println("learn coding");
    }
	static void M2(){
		
		System.out.println("learn java");
	}
	
	
	
}
class P2{
	int c=40;
    static int d=30;
    void M1() {
    	P1 p1=new P1();
    	System.out.println("value of a="+ p1.a);
    	System.out.println("value of b="+P1.b);
    	System.out.println("learning");
    }
	static void M2(){
		
		System.out.println(" java");
	}
	
	
	
}