package com.inheretence;
 class SuperDemo{
	
	 int salary = 50000;
	public void getSalary(int salary) {
		salary=60000;
		System.out.println("My Parent Salary is:"+salary);
	}
}
public class ThisDemo extends SuperDemo {

	int salary = 40000;
	public void getSalary(int salary) {
		salary =30000;
		System.out.println("My Salary is :"+salary);
		System.out.println("My Global Salary is :"+this.salary);
//whenever local and global variables are same then we can use this keyword 
		//to print.
	    System.out.println("Object is :"+this);
	    super.getSalary(70000);
	    System.out.println("my parent salary is :"+super.salary);
	}
	public static void main(String[] args) {
		ThisDemo td =new ThisDemo();
		td.getSalary(20000);
		// System.out.println(td); //same output as line 11
		
	}
}
