package com.polymerphism;

public class ProductSearch {

	public void search(int pid) {
		System.out.println("product search by id"+pid);
	}
	public void search(String pname) {
		System.out.println("search product by name"+pname);
 
	}
	public void search(int pid,String pname) {
		System.out.println("search product by name "+  pname   +"and id"  +  pid);
	}
	public static void main(String[] args) {
		ProductSearch ps= new ProductSearch();
		ps.search(123);
		ps.search("laptop");
		ps.search(1234, "phne");
	}
}
