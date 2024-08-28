package com.constructor;

import java.util.Scanner;//ctrl+shift+O

public class ScannerDemo {
	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First No");
			int fnum = sc.nextInt();
			System.out.println("Enter second No");
			int snum = sc.nextInt();
			
			int result = fnum+snum;
			System.out.println("Addition of two numbersis :"+result);
		}

	}

}
