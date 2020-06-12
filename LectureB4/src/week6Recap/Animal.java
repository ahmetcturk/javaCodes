package week6Recap;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Animal {

	// properties - Global variable
	int legs;
	String type;
	
	/*
	 *  Difference between method and constructor
	 *  - Constructor                - Method
	 *   no return type				    return type required
	 *   initialize objects				performing functionality of an object
	 *   invoke implicitly				invoke explicitly
	 *   Same name with class			Can be named as anything
	 *   can not be final
	 */
	
	
	 Animal(int legs, String type) {
		this.legs = legs;
		this.type = type;
	}
	 
	 
	 public static void main(String[] args) {

		// Final variables can not be updated
		final int a = 9;
		// a = 10;
		System.out.println(a);
		
		
		 
		 
		 
		 
		 
	}



}
