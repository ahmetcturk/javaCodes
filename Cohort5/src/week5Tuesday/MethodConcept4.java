package week5Tuesday;

public class MethodConcept4 {

	public static void main(String[] args) {
		// Object without reference : Another way to call method
		new MethodConcept4().sumOfTwo(5, 7);
		
		MethodConcept4 object = new MethodConcept4();
		object.sumOfTwo(10, 9);

		object.area(90, 20);
	}
	// Create a method which calculates area of the rectangles 
	// area(int height, int width)
	
	void area(int height, int width){
		System.out.println("Area : " + height*width);
	}
	
	
	// Create a method which finds sum of two numbers
	void sumOfTwo(int number1, int number2){
		System.out.println(number1 + number2);
	}
	
	
}
