package week4;
import java.util.ArrayList;

import week2.StringMethods;

public class MethodsExplained2 {
	
	
	public static String helloSiliconeLabs(){
		
		return "Hello Silicone Labs ";
	} 
	
	public static void helloWorld(){
		System.out.println("Hello World");
	}
	int square(int number){
		return number*number;
	}
	String printOut(String print){
		return print + "!";
	}
	static ArrayList<String> arraylistMethod(){
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Ahmet Can");
		return arrayList;
	}
	
	// Overloading methods
	static int calculate1(int a, int b){
		return a + b;
	}
	static int calculate1(int a, int b, int c){
		return a + b + c;
	}
	static int calculate1(int a, int b, int c, int d){
		return a + b + c + d;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10%3);
		System.out.println(10 + 5/2);
		System.out.println(calculate1(5, 6));
		System.out.println(calculate1(5, 6, 7));
		System.out.println(calculate1(4,5,6,7));
		
		helloSiliconeLabs(); // "Hello Silicone Labs", calling this method right now is useless.
		helloWorld();
		System.out.println(helloSiliconeLabs() + "I love java");
		//System.out.println(helloWorld());// =  System.out.println(System.out.println("Hello World"));
		MethodsExplained2 object = new MethodsExplained2();
		System.out.println(object.square(7) + 88); // object.square(7) = 49,  I can make arithmetic calculation with that
		System.out.println(object.printOut("Slack"));
		System.out.println(arraylistMethod() + " do anything :D");
	}

}
