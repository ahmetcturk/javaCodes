package week1;

public class Casting {

	public static void main(String[] args) {
		
		// Narrowing Casting
		double a = 3.9999;
		int a1 = (int)a;
		System.out.println(a1);

		
		// Widening Casting
		int b = 9;
		float b1 = b;
		
		byte myByte = 90;
		System.out.println("My Byte : " + (double)myByte);
		
		
		
		int num1, num2, num3;
		num1 = 10;
		num2 = 11;
		num3 = 20;
		
		System.out.println(((double)num1+num2+num3)/3);
		System.out.println((double)(num1+num2+num3)/3);
		System.out.println((num1+num2+num3)/3d);
		System.out.println((num1+num2+num3)/3f);
		
		
		
		
		char myChar = 'o';
		System.out.println((int)myChar); // Numeric value of the character (ASCII)
		
		int myInt = 171;
		System.out.println((char)myInt); // Character value of the numbers
	}

}
