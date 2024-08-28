package com.conditionalstate;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=10;
		
		System.out.println("you just entered");
		while(i>1)
		//while(i<1)//=empty because this did not  satisfied the condition. 
		{
			System.out.println("condition satisifed");
			System.out.println(i);
			i--;
		}
		System.out.println("wrong condition");
	}
}
