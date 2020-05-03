package week1;

public class AssignmentOperators {

	public static void main(String[] args) {
		int num1, num2;

		// = , +=, -=, *=, /=, %/

		// = Example Assigning value to the variables with = sign
		num1 = 90;
		num2 = 100;

		// += Example , It assigns left side into left side + right side
		int num3 = 30;
		int num4 = 10;
		num3 += num4; // num3 = num3 + num4
		System.out.println("This is num 3 : " + num3); // 40

		// -= Example, It assigns left side into left side - right side
		int num5 = 42;
		int num6 = 98;
		num6 -= num5; // num6 = num6 - num5
		System.out.println(num6); // 56

		// *= Example, It assigns left side into left side times right side
		int num7 = 88;
		int num8 = 44;
		num7 *= num8;
		System.out.println(num7); // 3872

		// /= Example , It assigns left side into left side divided by right
		// side
		int num9 = 88;
		int num10 = 44;
		num9 /= num10;
		System.out.println(num9); // 2

		// %= Example , 
		int num11 = 88;
		int num12 = 46;
		num11 %= num12; // num11 = num11 % num12
		System.out.println(num11); // 42

	}

}
