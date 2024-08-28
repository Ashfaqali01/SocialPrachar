package com.constructor;

public class Student {
	
	//without modifier
	int studentId; //0
	String studentName;//null
	
	//default constructor
	//public void assign() {
		//studentId=534;
		//studentName="Ashu";
	
	//with constructor
	
	public Student(){
		studentId=3435;
		studentName="Ashu";
		
	}
	
	public void display() {
		System.out.println(studentId+" "+studentName);
	}
	public static void main(String[] args) {
		 Student st=new Student();
		 //st.assign();
		 st.display();
		
	}
}
