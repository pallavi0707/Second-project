package com.objectmethode;

import java.util.Scanner;     //to find dynamic or static data we use scanner class//

public class Students1 {
	int s_Id;
	String s_Name;
	String city;

	public static void main(String[] args) {
		System.out.println("enter s_Name");
		 Scanner sc=new Scanner(System.in);
		 String s_Name=sc.next();
		 System.out.println("enter s_Id");
		 int s_Id=sc.nextInt();
		 System.out.println("enter city");
		 String city=sc.next();
		 Students1 s=new Students1();
		 s.setS_Name(s_Name);
		 s.setS_Id(s_Id);
		 s.setCity(city);
		
		 System.out.println("first students="+s);
	}

	public int getS_Id() {
		return s_Id;
	}

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public String getS_Name() {
		return s_Name;
	}

	@Override
	public String toString() {
		return "Students1 [s_Id=" + s_Id + ", s_Name=" + s_Name + ", city=" + city + "]";
	}

	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
