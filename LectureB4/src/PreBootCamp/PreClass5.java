package PreBootCamp;

public class PreClass5 {

	public static void main(String[] args) {

		// Widening Casting
		int a = 10;
		double b = a;
		System.out.println(b); // Output : 10.0

		// Narrowing Casting
		double c = 10.9;
		int d = (int) c;
		System.out.println(d); // Output : 10

		// Char to int conversion
		System.out.println((int) 'a');// ASCII value :

		// int to char conversion
		System.out.println((char) 8604);

		// Question1
		double x = 99.9;
		int y = (byte) x; // short, byte, int
		System.out.println(y); // Output :

		// Question2
		double t = 1000;
		int e = (byte) t; // -128 ---  +127 126,127,-128,-127,-126.......0, 1,2,3,......127, -128
		System.out.println(e); // Output : -24
	}

}
