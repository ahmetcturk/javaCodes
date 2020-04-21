package polyMorphism;

//This example will demonstrate Overriding concept in polymorphism

public class OverloadingConcept {

	public static void main(String[] args) {
		
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// Overloading enables our methods to be used in more flexible ways
		// instead of creating a method with different way, we are overloading the method
		// access modifiers can be different in method overloading
		// Only method names needs to be same
		int array [] = {1,2,3,4,5};
		String array2 [] = {"Inheritance", "Polymorphism", "Abstraction", "Encapsulation"};
		new OverloadingConcept().arrayPrinter(array2);
		
	}
	private int arrayPrinter(String arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}
	
	void arrayPrinter(int arr[]){ // This method only prints int arrays
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
