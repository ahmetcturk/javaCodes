package myFirstPackage;

public class Casting {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// Narrowing Casting
		
		double GPA = 3.8;
		
		int GPA1 = (int) GPA;
		System.out.println(GPA1);
		
		float myFloat = 7.88f;
		int myInteger = (int) myFloat;
		System.out.println(myInteger);
		System.out.println(myFloat);
		
		// Widening Casting = Automatic process
		int myInt = 90;
		double myDouble = myInt;
		System.out.println(myDouble);
		System.out.println(myInt);
		
		int num1 = 3;
		int num2 = 6;
		System.out.println((double)num1/num2);
		
	}

}
