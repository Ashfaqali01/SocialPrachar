package com.polymerphism;

public class Calculator {
//method overloading
	//method name is same but no of parameters is different 
	//method name is same but type of parameters is different 
	//method name is same but order of parameters is different 

	public void addition(int a,int b) {
		System.out.println("addditti of two ns:"+(a+b));
		
	}
	public void addition(int a , int b, int c) {
		System.out.println("addition f three nos are :"+(a+b+c));
	}
	public void addition(float a, float b )
{
		System.out.println("addition of two floats is:"+(a+b));
		
		}
    public void addition(int a ,float b) {
    	System.out.println("addition of it , float:"+(a+b));
    	
    }
public void addition(float a,int b) {
	System.out.println("addition of float and int:"+(a+b));
	
	
}
public static void main(String[] args) {
	Calculator cl= new Calculator();
	cl.addition(23f, 03f);
	
}
}
