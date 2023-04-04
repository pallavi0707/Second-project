package com.objectmethode;        //constuctor are automatically call when we create object

public class Students2 {          //3 constuctor
	int id;                       //1 default -automatic add by jvm-no parameter-scop-public - we cannot change scop//
	String first_Name;            //2 no argument-add by user -no parameter-scop-public - we can change scop
	String last_Name;             //3 parameter -add by user-N-no. of constuctor-bydefault scop public
	double persentsge;
	public static void main(String[] args) {
		Students2 s=new Students2();
		Students2 s1=new Students2(5);
		Students2 s3=new Students2(101,"poja","patil",80.00);
		System.out.println("students="+s3);
		
	}
	@Override
	public String toString() {
		return "Students2 [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", persentsge="
				+ persentsge + "]";
	}
	
	
	Students2 (){                   ///no argument constructor//
		System.out.println("pallavi");
	}
	
	Students2 (int a){                       ///argument type constructor//
		System.out.println("phule");
	}
	public Students2(int id, String first_Name, String last_Name, double persentsge) { ///using field constructor
		
		this.id = id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.persentsge = persentsge;
	}
	
	
}
