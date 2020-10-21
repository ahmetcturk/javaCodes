package week5Tuesday;

public class MethodConcept3 {

	public static void main(String[] args) {
		MethodConcept3 object = new MethodConcept3();
		//                   Argument
		object.printMessage("Study hard");
		object.printMessage("Study Java");
		
		object.square(9);
	}
	
	// Create a method which finds the square of the numbers
	void square(int number){
		System.out.println("Square of the number is : "+number * number);
	}
	
	//                 Parameter
	void printMessage(String message){
		System.out.println("Message : " + message);
	}

}
