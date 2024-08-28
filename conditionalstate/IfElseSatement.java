package com.conditionalstate;

public class IfElseSatement {
  
	public static void main(String[] args) {
		String feedback="good";
		if(feedback=="bad") {
			System.out.println("bad service");
		}
		else if (feedback=="worst") {
			System.out.println("worst service");
		}
		else if (feedback=="good") {
			System.out.println("good service");
		}
		else if (feedback=="excellent") {
			System.out.println("excellent service");
		}
		else if (feedback=="very good") {
			System.out.println("very good service");
		}
		else{
		System.out.println("change the menu");
	}
}
}
