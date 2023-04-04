package com.objectmethode;

import java.util.Scanner;

public class AssignValueToObjectClone {
public static void main(String[] args) throws CloneNotSupportedException {
	assignvalue();
	
}
static void assignvalue() throws CloneNotSupportedException {
Scanner sc= new Scanner(System.in);
System.out.println("enter empId");
int empId=sc.nextInt();
System.out.println("enter empName");
String empName=sc.next();
System.out.println("enter salary");
double salary=sc.nextDouble();
Employee e=new Employee(empId, empName, salary);
System.out.println("first emp="+e);
Employee e1=(Employee) e.clone();
System.out.println("copy of e="+e1);

}


}
class Employee implements Cloneable{
	int empId;
	String empName;
	double salary;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}