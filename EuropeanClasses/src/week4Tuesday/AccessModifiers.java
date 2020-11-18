package week4Tuesday;

public class AccessModifiers {

	public static void main(String[] args) {
		
		// Calling the static methods from another class
		MethodConcept3.reverseString("Hello");
		System.out.println(MethodConcept2.fullName("Ahmet Can", "Turk"));
		System.out.println(Math.pow(3, 3));
		
		// Public, private, default(empty), protected
		// Public : You can call public methods from anywhere in the project
		// private : You can private method only from inside of that class
		// default : You can access to the method only from same package
		
		
		
	}

}
