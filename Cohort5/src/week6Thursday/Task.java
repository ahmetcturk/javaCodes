package week6Thursday;


// Create 2 fields and a method to initialize the fields
// Create an object and initialize the fields, print the fields
public class Task {

	int a;
	String bString;
	
	void initializer(int a , String bString){
		this.a = a;
		this.bString = bString;
	}
	
	public static void main(String[] args) {
		
		Task object1 = new Task();
		object1.initializer(9, "A");
		
		System.out.println(object1.a);
		System.out.println(object1.bString);

	}

}
