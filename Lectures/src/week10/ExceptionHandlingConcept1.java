package week10;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.InputMap;

public class ExceptionHandlingConcept1 {

	public static void main(String[] args) {
		
		// after try block, we need to create one or more catch block or finally block
		try {
		int [] arr ={1};
		System.out.println(arr[4]); // Exception
		System.out.println(9/0); // Exception
		System.out.println("Hello Silicone Labs");
		}
		catch (Exception e) {
			System.out.println("This is catch block");
		}
		
		
		System.out.println("Hello World");
		
	}

}
