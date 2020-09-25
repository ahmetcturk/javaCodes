package week1Tuesday;

public class Casting {

	public static void main(String[] args) {
		// narrowing casting
		double a = 42.98;
		
		double b = a;
		//       narrowing casting
		int c = (int)a;
		
		System.out.println(c);
		
		int number = 35;
		// 					widening casting
		System.out.println((double)number);
		
		// widening casting (automatically)
		
		int x = 100;
		
		double y = x;
		
		System.out.println(y);
		
		
		int numerator = 9;
		int denominator = 2;
		
		System.out.println((double)numerator/denominator);
		
		char character = 'A';
		System.out.println((int)character);

	}

}
