package week1Tuesday;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = 100;
		num2 = 43;
		
		// = Assigning right to the left side
		num1 = num2; // num1 = 43
		num2 = num1; // 
		System.out.println(num2);

		System.out.println(num1);
	
		num2 = 900;
		System.out.println(num2);
		
		
		// Assignment Operators : +=, -=, *=, /=, %=
		
		// += This operator turns left side into left side plus right side
		
		int num3 = 100;
		
		num3 += 40 ; // num3 = num3 + 40 -->  num3 = 140
		
		num3 += 100; // num3 = num3 + 100 --> num3 = 240
		
		// -= This operator turns left side into left side minus right side
		
		num3 -= 30; // num3 = num3 - 30 --> 210
		
		// /= This operator turns left side into left side divided by right side
		
		num3 /= 3; // num3 = num3 / 3 --> 70
		
		// *= This operator turns left side into left side multiplied by right side
		
		num3 *= 2; // num3 = num3 * 2 --> 140
		
		// %= 
		
		num3 %= 8; // num3 = num3 % 8 --> 4
		
		
		
		
		

	}

}
