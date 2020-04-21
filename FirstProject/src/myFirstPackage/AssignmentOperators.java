package myFirstPackage;

public class AssignmentOperators {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		int num1, num2;
		num1 = 90;
		num2 = 70;
		
		System.out.println("Number 1 : " + num1);
		// = Assigns left side into right side
		num1 = num2;
		
		System.out.println("Number 1 : " + num1);
		
		// += It assigns left side into left side plus right side
		
		int num3 = 10;
		int num4 = 20;
		System.out.println("Number 3 : " + num3);
		num3 += num4; // num3 = num3 + num4
		System.out.println("Number 3 : " + num3);
		
		// -= It assigns left side into left side minus right side
		
		int num5 = 90;
		int num6 = 80;
		System.out.println("Number 5 : " + num5);
		num5 -= num6; // num5 = num5-num6
		System.out.println("Number 5 : " + num5);
		
		// *= It assigns left side into left side times right side
		
		int num7 = 90;
		int num8 = 80;
		System.out.println("Number 7 : " + num7);
		num7 *= num8; // num7 = num7-num8
		System.out.println("Number 7 : " + num7);
		
		// /= It assigns left side into left side divided right side
		
		double num9 = 90;
		double num10 = 80;
		System.out.println("Number 9 : " + num9);
		num9 /= num10; // num9 = num9/num10
		System.out.println("Number 9 : " + num9);
				
	}

}
