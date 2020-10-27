package preBootCamp;

import java.time.Year;

public class RelationalOperators {

	public static void main(String[] args) {

		// This program includes relational operator examples

		// ==, !=, > ,<, >=, <=, !

		// == returns true if left is equals to right side
		System.out.println(9 == 8); // false
		System.out.println("Ahmet" == "Ahmet");// true

		// != returns true if left is not equals to right side
		System.out.println(9 != 9); // false

		// > returns true if left is greater than right side
		System.out.println(9 > 8);// true
		
		// < returns true if left is less than right side
		System.out.println(9 < 8); // false
					
		
		// >= returns true if left is greater than or equal to right side
		int x = 11, y = 11;
		
		System.out.println(x >= y); // 
		
		
		// <= returns true if left is less than or equal to right side
		
		System.out.println(8 <= 9);
		
		
		boolean boolean1 = (8 <= 9); // true
		System.out.println(boolean1);
		
		int a = 90, b = 88;
		
		boolean boolean2 = (a==b);
		System.out.println(boolean2);
		
		// ! : It converts true into false, false into true
		
		System.out.println(!(9>0));
		System.out.println(!(9<0));	

	}

}
