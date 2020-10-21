package week5Tuesday;

public class MethodConcept5 {

	public static void main(String[] args) {
		MethodConcept5 object = new MethodConcept5();
		
		int [] array = {9,8,7,6,5,4};
		int [] array2 = {1,2,3,4,6,9,0};
		
		object.printArray(array);
		System.out.println();
		object.printArray(array2);

	}
	
	// Create a method which prints out arrays
	// void printArray(int [] intArray) : Use For Loop
	
	// Argument data will convert into parameter and will be stored in parameter variable
	void printArray(int [] intArray){
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

}
