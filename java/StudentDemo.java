package varaible.java;

public class StudentDemo {
	
	int studentId = 2342;
	String studentName="ashu";
	int studentMarks = 14235;
	String studentAddress="hyd";
	public void studentDetails() 
	{
	System.out.println(studentId+" "+studentAddress+" "+studentMarks+" "+studentName+" ");
	
	}

public static void main(String[] ashu)//we can write variable in any form we can write any of the string name
{
	StudentDemo sd = new StudentDemo();
	
	sd.studentDetails();
}
}


