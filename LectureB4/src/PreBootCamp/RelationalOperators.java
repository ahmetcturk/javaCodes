package PreBootCamp;

public class RelationalOperators {

	public static void main(String[] args) {
		
		// This program includes relational operator examples
		
		// ==  This operator checks if two sides are equals to each other
		
		System.out.println(9==8); // Output : False
		System.out.println(9==9); // Output : True
		int a,b;
		a = 10;
		b = 99;
		System.out.println(a==b);// Output : false
		
		// != This operator checks returns true if left side is different from right side
		
		System.out.println(10 != 99); // Output : true
		System.out.println(a != b); // Output : True

		// > Returns true if left side is greater than right side
		
		System.out.println(4>7); // Output : False
		
		boolean isGreater = 9>0;
		System.out.println(isGreater); // Output : true
		
		// < Returns true if left side is less than right side
		
		System.out.println(7<9); // Output : true
		
		
		// >= Returns true if left side is greater than right side or they are equal
		
		System.out.println(8>=9); // Output : False
		System.out.println(9>=9); // Output : True
		
		// <= Returns true if left side is less than right side or they are equal
		
		System.out.println(8<=9); // Output : True 
		System.out.println(9<=9); // Output : True
		
		// ! (Ternary) This operator converts the boolean values to their opposites
		
		System.out.println(!(9>=10)); // Output : True
		System.out.println(!true);
		
		
	}

}
