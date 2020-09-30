package week1Tuesday;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// Arithmetic operators : +, -, *, /, %(remainder)
		
		// Relational Operators : ==, >, <, >=, <=, !=, !
		
		System.out.println(9>8); // true
		System.out.println(8<1); // false
		
		// Boolean variables can hold boolean expressions
		boolean variable = (9>8);
		
		System.out.println(variable);
		
		// == checks if the left side is equals or not with right side
		System.out.println("Forth Expression : " + (42==98));
		
		System.out.println("Ahmet" == "Ahmet");
		
		// != this returns true if left side is not equals to right side
		System.out.println("Sixth Expression : "  + (99 != 99));

		// ! converts boolean value to opposite
		
		System.out.println("Seventh Expression :  " + !(4>5));
		
	}

}
