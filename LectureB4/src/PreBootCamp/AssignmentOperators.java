package PreBootCamp;

public class AssignmentOperators {

	public static void main(String[] args) {
		// Assignment Operators

		// = it assigns left side with right side
		int a = 9;
		int b = 10;
		a = b; // change a into b
		System.out.println(a); // a = 10

		// += change left side into left side plus right side

		int x = 10;
		int y = 90;
		x += y; // x = x + y;
		System.out.println(x); // x = 100

		// -= change left side into left side minus right side

		int x1 = 5;
		int y1 = 45;
		x1 -= y1; // x1 = x1 - y1;
		System.out.println(x1); // -40

		// *= change left side into left side times right side

		int x2 = 7;
		int y2 = 9;
		x2 *= y2; // x2 = x2*y2
		System.out.println(x2); // x2 = 63

		// /= change left side into left side divided by right side

		double x3 = 27;
		double y3 = 9;
		x3 /= y3; // x3 = x3/y3
		System.out.println(x3); // x3 = 3

		// %= it changes left side into remainder of the left side divided by right side

		double x4 = 30;
		double y4 = 9;
		x4 %= y4; // x4 = x4 % y4
		System.out.println(x4); //x4 = 3.0

	}

}
