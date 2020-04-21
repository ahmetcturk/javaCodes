package secondPackage;

public class VoidMethods {
	 
	
	public void helloWorld(){
		System.out.println("Hello World");
		System.out.println("Hello World Again");
	}
	
	public void printOut(String print){ // Parameterized method
		System.out.println("Your parameter is : " + print);
	}
	
	// This method will add numbers to each other
	public void addNumbers(int a, int b, int c){ // 3 parameter method
		System.out.println("Addition is : " + (a+b+c));
	}
	
	void areaOfTriangle(int height, int base){ // this method doesn't use public keyword
		double area = ((double)height * base)/2;
		System.out.println("Area of the triangle is : " + area);
		
	}
	
	void printArray(int [] array){ // This method will print different int arrays
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static void main(String[] args) {
		// Program starts to execute from main method
		// Create an object in order to call methods
		// We are creating methods inside of the class, outside of the main method
		
		VoidMethods object = new VoidMethods(); // object name is identifier
		object.helloWorld(); // this statement will call my method (helloWorld)	
		object.printOut("Java"); // Java is an argument
		object.addNumbers(9, 4, 8); // Argument data type needs to match with parameter data type
		object.areaOfTriangle(3, 3);
		
		int []myArray = {1,2,3,4,5,6,7};
		object.printArray(myArray);// argument have to be array
		System.out.println();
		// Let's create a method which prints String array elements
		String []stringArray = {"I ", "Love ", "Java!"};
		object.printArray(stringArray);
	}
	
	
	// This method has same name with int array printer method
	// We overloaded printArray method.
	void printArray(String [] array){ // This method will print different String arrays
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}


}

