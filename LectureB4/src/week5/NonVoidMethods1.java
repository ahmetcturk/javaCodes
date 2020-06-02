package week5;

import javax.management.monitor.StringMonitor;

public class NonVoidMethods1 {

	// Methods needs to be created inside of the class.
	// We can not create a method inside of an another method
	
	// Non-void methods needs to have return keywords
	
	public static void main(String[] args) {
		NonVoidMethods1 object = new NonVoidMethods1();
		
		System.out.println(object.addition(9, 8));

		int calculation = object.addition(9, 8);
		
		System.out.println(calculation);
		
		System.out.println(object.printOut("I love Java"));
		
		String sentence = object.printOut("We love Java");
		
		System.out.println(sentence);
		
		System.out.println(object.doubleMethod((byte)4, "Ahmet "));
		
	}
	
	// return value needs match with method return type
	double doubleMethod(byte a, String name){
		System.out.println(name  + a);
		System.out.println("Hello World");
		return 3.0;
	}
	
	
	String printOut(String string){
		return string + " !";
	}
	
	int addition(int a, int b){
		
		return a+b; // int values  
	}
	
	

}
