package com.string;

public class StringDemo {

	public static void main(String[] args) {
		String name ="capgemini";
		String name1 ="capgemini";
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(2));
		System.out.println(name.codePointBefore(4));
	    System.out.println(name.codePointCount(1, 5));
	//String sc =name2 sc.trim() we use for the removing space from the string.
	    System.out.println(name.compareTo("capge"));
	    System.out.println(name.compareToIgnoreCase("pge"));
	    System.out.println(name.concat(name1));
	    System.out.println(name.endsWith("mini"));
	    System.out.println(name.equalsIgnoreCase("capgemini"));
	    System.out.println(name.hashCode());
	    System.out.println(name.indexOf('c'));
	    System.out.println(name.indexOf('a'));
	    System.out.println(name.isEmpty());
	    System.out.println(name.lastIndexOf('i'));
	    
	
	
	}
}
