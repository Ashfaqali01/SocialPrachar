package com.string;

public class StringReverse {

	public static void main(String[] args) {
		String name= "sleeping  world";
		String reverse=" ";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse = reverse+name.charAt(i);
			
		}
	System.out.println(name+"original world:");
	System.out.println(reverse + "reversed word:");
	}
	
}
