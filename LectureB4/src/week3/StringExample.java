package week3;

import week2lab.Lab3;

public class StringExample {

	public static void main(String[] args) {	
		
		int age;
		boolean myBoolean;
		
		
		// How to create String in different ways
		// String is a class, we can create a string reference(variable - Non primitive datatype)
		// 1 ) String Literal
		String string = "Hello World";
		String string2 = "Hello World";
		// 2) Creating a string with new keyword
		String string3 = new String("Hello World");
		String string4 = new String("Hello World");
		
		// Every class can have references
		StringExample name2;
		Lab3 lab3;
		
		//Strings are immutable, unchangable 
		// StringBuffers, mutable, changable, synchronized, thread safe , relatively slower than stringbuilders
		StringBuffer stringBuffer = new StringBuffer("Dr Ilhan");
		System.out.println(stringBuffer);
		// StringBuilders, mutable, changable,non-synchronized, non-thread safe, relatively faster than Stringbuffer
		StringBuilder stringBuilder = new StringBuilder("Robert Turk");
		System.out.println(stringBuilder);
		
		
		
	}

}
