package cm.inheretence;

 class Person {

	//for inheritance and polymorphism it maintains  the performance 
	//security for  the abstraction and encapsulation
	
		String name;
		int age;
		String address;
		
		//class to class --------------->extends
		//class to interface ----------->implements
		//interface to class ----------->implements
		//interface to interface-------->extends
	public void displayInfo()
	{
		System.out.println("Name is :"+name+"address is :"+address+"age is:"+age);
	}
	}
		public class  Employee extends Person{
			int salary=12345;
		public static void main(String[] args) {
			Employee em= new Employee();
			System.out.println(em.salary);
			em.displayInfo();
	}
}
