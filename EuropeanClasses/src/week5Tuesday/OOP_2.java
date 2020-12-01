package week5Tuesday;

public class OOP_2 {

	public static void main(String[] args) {
		// Create 2 reference and assign values for it
		Class2 ref1 = new Class2();
		ref1.a = 9;
		ref1.bString = "Field";
		Class2 ref2 = new Class2();
		ref2.a = 99;
		ref2.bString = "GV";
		System.out.println("Reference 1 a : " + ref1.a + "\nReference 1 b : " 
		+ ref1.bString + "\nReference 2 a : " + ref2.a + "\nReference 2 b : " 
		+ ref2.bString);
	}

}


class Class2{
	// Global Variables, attributes, instance variables, field
	int a; 
	String bString;
}