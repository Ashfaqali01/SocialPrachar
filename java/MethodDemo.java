package varaible.java;

public class MethodDemo {

	
	int age=45;
	static String name = "keerthi";
	
public void display() //instance variable without return type without parameters void = without return type
{
	System.out.println("I am display method");
}
public int addOfTwoNumbers(int a,int b)//instance method with return type with parameters
{
   return a+b;
}
public void subOfTwoNumbers(int a, int b) //instance variable without return type with parameters
{
	System.out.println("subtraction of two numbers " +(a-b));
}
//public static void display() //static variable without return type without parameters void = without return type
//{
	//System.out.println("I am display method");
//}
//public static int addOfTwoNumbers(int a,int b)//static method with return type with parameters
//{
  // return a+b;
//}
//public static void subOfTwoNumbers(int a, int b) //static variable without return type with parameters
//{
	//System.out.println("subtraction of two numbers " +(a-b));
//}
	
	public static void main(String[] args)
	{
		
		//object creation
		MethodDemo md = new MethodDemo();
		md.display();
		System.out.println("addition of two numbers" +md.addOfTwoNumbers(23, 303));
		md.subOfTwoNumbers(45, 40);
		System.out.println("My age is :" +md.age);
		System.out.println("My name is :" +MethodDemo.name);
	}

}


