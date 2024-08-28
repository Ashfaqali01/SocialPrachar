package com.parent;
class Employee{
	public void m2() {
		System.out.println("I am  a employee");
	}
}
public class Parent {
	public void m1()
	{
		System.out.println("I am a Parent");
	}
	public static void main(String[] args) {
		Parent pn = new Parent();
		pn.m1();
		//Employee em= new Employee();
		//pn.m2();
	}
}