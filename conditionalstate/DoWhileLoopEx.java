package com.conditionalstate;

public class DoWhileLoopEx {
	
	public static void main(String[] args) {
		int i=10;
		System.out.println("befre entering do loop");
		
		do {
			System.out.println("after enter the loop");
			System.out.println(i);
			i--;
			System.out.println("after printing");
		}while(i>=1) ;
		
		System.out.println("after conditin checking");
	}

}
