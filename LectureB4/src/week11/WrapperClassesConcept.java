package week11;

import java.util.ArrayList;

public class WrapperClassesConcept {

	public static void main(String[] args) {
		
		// Wrapper classes are object version of primitive data types
		
		// Integer, Double, Byte, Short, Float, Long...
	   // Wrapper classes are provides mechanism to convert primitive data type to object
		
		Integer num = new Integer(99);
		Integer num1 = new Integer(98);
		System.out.println(num + num1);
		
		
		ArrayList<Integer> list = new ArrayList<>();
		int number = 99;
		list.add(number); // Boxing : primitive to object
		list.add(98);
		
		int number2 = list.get(0); // Unboxing : object to primitive
		
		Number numberObject = new Integer(55);
		numberObject = new Double(42.98);
		
		
		

	}

}
