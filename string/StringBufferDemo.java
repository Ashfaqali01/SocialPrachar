package com.string;

public class StringBufferDemo {
  
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("welcome");
		StringBuffer sb1 =new StringBuffer("welcome");
		
		
		System.out.println(sb.equals(sb1));
		System.out.println(sb==sb1);
		
		sb.append("ashu");
		System.out.println(sb);
	}
}
