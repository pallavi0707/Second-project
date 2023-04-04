package com.loopstatement;   // PRINT EVEN NO OF 1 TO 10 USING FOR EACH LOOP

public class ForEachloop {
	
	static void M1() {
		
	int PQR[]=new int[10];
	PQR[0]=1;
	PQR[2]=2;
	PQR[1]=3;
	PQR[3]=4;
	PQR[4]=5;
	PQR[5]=6;
	PQR[6]=7;
	PQR[7]=8;
	PQR[8]=9;
	PQR[9]=10;
	 for(int num:PQR) {
		 if(num%2==0)
		 System.out.println(" Even num=="+num);
		 
	 }
	}
			   
			   
			   
			   
			   
	public static void main(String[] args) {
		
		ForEachloop.M1();
	}
}
