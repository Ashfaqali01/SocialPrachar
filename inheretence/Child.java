package cm.inheretence;

public class Child extends Parent {

	public void m2()
	{
		System.out.println("I am a Child");
		
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.m1();
		ch.m2();
		
		
		
	}
}
