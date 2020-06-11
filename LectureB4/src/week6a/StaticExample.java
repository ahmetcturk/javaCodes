package week6a;

public class StaticExample {

	static int numberOfObject;
	public StaticExample() {
		numberOfObject++;
	}
	public static void main(String[] args) {
		
	// Task : Create a program which counts the number of object that has been created
		new StaticExample();
		StaticExample object1 = new StaticExample();
		StaticExample object2 = new StaticExample();
		System.out.println(object1.numberOfObject);

		// What happens when we create an object ?
		// When we create object, we are using constructor.
		
	}

}
