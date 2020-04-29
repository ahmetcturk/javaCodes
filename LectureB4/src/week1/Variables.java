package week1;

public class Variables {

	public static void main(String[] args) {
		// Variables are placeholder in RAM
		
		// 1) Datatype variableName = value;
		
		// 2) DataType variableName;
		//    variableName = value;
		
		// Byte Examples
		byte myByte = 127; //-128 -- (127)
		System.out.println("My Byte Value : " + myByte);
		
		// Short Example
		short myShort = 3000;
		System.out.println("My Short Value : " + myShort);
		
		// Integer Example
		int myInt;
		myInt = 90000;
		System.out.println("My Int Value : " + myInt);
		
		// Long Example
		long myLong = 100000000000L;
		System.out.println("My Long Value : " + myLong);
		
		// Float Example
		float myFloat = 42.98F;
		System.out.println("My Float Value : " + myFloat);
		
		// Double
		double myDouble = 8000.9d;// or 8000.9d
		System.out.println("My Double Value : " + myDouble);
		
		// Boolean true-false
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		System.out.println("My Boolean1 Value : " + myBoolean1);
		System.out.println("My Boolean2 Value : " + myBoolean2);
		
		// Character Example
		char myChar = 'ø';
		System.out.println("My Char Value : " + myChar);
		
		
		// Non Primitive Data Type : String
		String myString = "Ahmet Can Turk Loves Java Programming.....";
		System.out.println(myString);
		
		
		int a =10, b = 5;
		int total = a+b;
		double totalAge = 2;
		double average = total / totalAge;
		System.out.println(average);
		
	}

}
