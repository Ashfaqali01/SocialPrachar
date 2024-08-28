package com.conditionalstate;

public class SwitchDemo {
	
	public static void main(String[] args) {
		String feedback="good";
		switch (feedback) {
		//switch// if options are available then it is not recommended to 
		//use nested if else because it reduce durability to handle this requirement 
		// we should go through SWITCH Statement.
		
		case "bad":
			System.out.println("your service is bad");
		case "good":
			System.out.println("your service is good");
			break;
		case "verybad":
			System.out.println("your service is very bad");
			break;
		case "very good":
			System.out.println("your service is very good");
			break;
		case "excellent":
			System.out.println("your service is excellent");
			break;

		default:
			System.out.println("enter a correct feedback");
			break;
		}
	}

}
//***CONCLUSION
// **The allowed argument types for the switch statements are (byte,short,char,int)1.4
//version but in 1.5 version corresponding wrapper classes and ENUM type also allowed
//and ENUM type also allowed and 1.7 version string type also allowed.

//**Curly braces are mandatory ,except every where curly braces are optional.
//**Both case,default are optional i.e an empty switch statement is a valid java syntax.
//Example
//int x=10;
//switch(x)
//{
//
//}
// inside a switch very statement should be under some case r default .
// every case label should be compile time constant (i.e constant expression).
//int x=10; 
//int y=10;
//switch(x) {
//case 10:
//	System.out.println(10);
//	break
//case y://wrong we should use int only in case 
//	System.out.println(20);
//	break
//}
	
//ever case label should be in the range of switch argument type otherwise we will get compile time error.
//byte b=10;
//switch(b){
//case 100:
	//syso(1000);//wrong
//no duplicate 
