package com.polymerphismOveriding;

	
class Mother{
	public void eating() {
		System.out.println("don't eat ice cream");
	}
}
public class Child extends Mother {
	@Override
	public void eating()
	{

System.out.println("no no i want to eat an ice cream");
	}
	public static void main(String[] args) {
	Child ch =new Child();
    ch.eating();
}
}