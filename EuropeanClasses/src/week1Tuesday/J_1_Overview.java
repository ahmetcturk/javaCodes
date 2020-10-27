package week1Tuesday;

public class J_1_Overview {

	public static void main(String[] args) {
		
		// Variables : variables are data holders in RAM
		
		// Create a program which calculates area of the rectangle
		int height = 40, width = 10;
		int area = height * width;
		
		//Primitive - NonPrimitive Data types
		
		//Primitives : Java stores them in RAM
		//Numeric	:byte, short, int, long, float, double, 
		//Non Numeric :boolean, char
		
		// Non Primitive Data Types : Java stores them in Heap memory
		// All the objects of classes (String, arrays, all objects...)
		
		
		short myShort ; // Variable declaration
		myShort = 100;
		
		/*
		 * Multi
		 * Line
		 * Comment
		 * 
		 */
		
		// How can you name your variable ? 
		// Variable name can start with : a-zA-Z , Currencies : ($..), _
		
		// Assignment Operators : (+=, -=, *=, /=, %=, =)
		
		int x ; // variable declaration
		x = 10; // value assignment to variable
		System.out.println(x);
		x = 19;
		
		x %= 10; // x = x % 10
		
		System.out.println(x);
		
		
		// Conditional Operators:  (?:) - Ternary Operator
		
		int num1, num2;
		num1 = 42;
		// If boolean is true, pick up 1st value, if boolean is false pick up 2nd value
		//      boolean  1    2
		num2 = (false) ? 10 : 99;
		
		num2 = (false) ? num1 : 10;
		
		System.out.println("Number 2 : " +  num2);
		
		
		// Example 1 : 
		int a;
		a = (true) ? 4 : 5;
		System.out.println(a);
		
		
		// Example 2 : 
		int b ;
		boolean myBoolean = false;
		b = (myBoolean) ? 5:3;
		System.out.println(b);
		
		// Logical Operators : && : AND, || : OR
		
		 /*
		  && - If Left side and right side are true at the same time, 
		 then the whole expression will be true, 
		 otherwise whole expression will be false
		  */
		
		boolean myBoolean1 = false;
		System.out.println(myBoolean1);
		
		boolean myBoolean2 = 5>8; 
		boolean myBoolean3 = true && false;
		boolean myBoolean4 = true && true;
		
		System.out.println("My Boolean 3 : " + myBoolean3);
		
		System.out.println("My Boolean 4 : " + myBoolean4);
		
		/*
		 * If at least one of the sides are true, the whole expression will be true
		 * Otherwise, the whole expression will be false
		 */
		
		System.out.println(true || false);
		
		System.out.println(true || true);
	
		System.out.println(false || false);
		
		// Relational Operators (>,<,>=,<=,==,!=)
		System.out.println("First Expression : " + (9>8));
		System.out.println("Second Expression : " + (6<4));
		System.out.println("Third Expression : " + (5>=5));
		System.out.println("Fourth Expression : " + (8==8));
		System.out.println("Fifth Expression : " + (6!=6));
		
		
		
		
		
		
		
		
		
		
	}

}
