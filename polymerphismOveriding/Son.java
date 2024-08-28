package com.polymerphismOveriding;
class Parent{
	public void marriage() {
		System.out.println("Arrange Marrage");
	}
}

public class Son extends Parent{
@Override
	public void marriage() {
		System.out.println("Love Marrige");
	
	}
	public static void main(String[] args) {
		Son so= new Son();
		so.marriage();
		Parent pt =new Parent();
		pt.marriage();
	}
}
