package com.objectmethode;      //set values using getter setter//

public class Students {
public static void main(String[] args) {
	/*Students s=new Students();
	s.setS_Id(1);
	s.setS_Name("pallavi");
	s.setMarks(20);*/
	Students s1=new Students(101,"priti",20);
	System.out.println("first students=="+s1);
	
}

			int s_Id;
			String s_Name;
			int marks;
			
			public int getS_Id() {
				return s_Id;
			}
			public void setS_Id(int s_Id) {
				this.s_Id = s_Id;
			}
			public String getS_Name() {
				return s_Name;
			}
			public void setS_Name(String s_Name) {
				this.s_Name = s_Name;
			}
			public int getMarks() {
				return marks;
			}
			public void setMarks(int marks) {
				this.marks = marks;
			}
			@Override          //for string representsion of object data// f we do not write then it only gives hexadecimal values//
			public String toString() {
				return "Students [s_Id=" + s_Id + ", s_Name=" + s_Name + ", marks=" + marks + "]";
			}

			Students(int s_Id,String s_Name,int marks){
				this.s_Id=s_Id;
				this.s_Name=s_Name;
				this.marks=marks;
				
			}


}
