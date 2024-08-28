
package com.commandline;

public class Demo {

	public static void main(String[] args) {
		int ages[]=new int[6];
				ages[0]=38;
				ages[1]=18;
				ages[2]=28;				
				ages[3]=78;
				ages[4]=48;
				ages[5]=85;
				ages[6]=86;
				//System.out.println(ages[5]);
				//System.out.println(args[0]);
				//System.out.println(args[1]);
			//System.out.println(args[0]+args[1]);//45+45=4545 Because of its a string
			
		//wrapper class
		
		int fnum=Integer.parseInt(args[0]);
		int snum=Integer.parseInt(args[1]);
		int result=fnum+snum;
		System.out.println("Addition of two numbers is :" + result);
		
		
//         String name="ahjsfsgdfsdjgzkf";//           it is a way to convert string to character
//         char[] c=name.toCharArray();//
//         System.out.println(c[7]);// it is a way to convert string to character
	}
}

