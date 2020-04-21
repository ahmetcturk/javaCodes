package secondPackage;



public class NonVoidMethdod {

	// create a method which returns a string
	public String helloSiliconeLabs(){ // Non void methods require return keyword
		
		return "Hello Silicone Labs"; 
		// The data next to the return keyword needs to match with method type
		
	}
	
	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		// Create an object in order to call our methods
		
		NonVoidMethdod myObject = new NonVoidMethdod();
		
		myObject.helloSiliconeLabs(); // this expression holds a string value
		System.out.println(myObject.helloSiliconeLabs()); // it will print the string value
		String myString = myObject.helloSiliconeLabs() + ", you are doing great !";
		System.out.println(myString); // Hello Silicone Labs, you are doing great!
		
		System.out.println(myObject.square(5)); // we will put argument inside our method
		
		System.out.println(myObject.printOut("My method is working")); //" My method is working is" argument
	
		System.out.println(myObject.calculate(4, 5)); // 9
		System.out.println(myObject.calculate(3,4,6)); // 13
		System.out.println(myObject.calculate(4, 5, 6, 7)); // 22
	}
	
	// Create a method which adds two numbers
	int calculate (int a, int b){
		return a +b;
	}
	
	// Create a method which adds three numbers
	int calculate(int a, int b, int c){ // Overloaded version of calculate method
		return a+ b + c;
	}
	
	// Create a method which adds four numbers 
	int calculate(int a, int b, int c, int d){ // Overloaded version of calculate method
		return a+ b + c + d;
	}
	
	
	
	
	// create another method which is printing the string messages
	String printOut(String string){ // string is a parameter
		return string + " !"; // string + "!" is a string type
	}
	
	
	
	
	
	// create a method which finds square of the numbers
	int square(int a){ // one parameter method
		
		return a*a; // a*a is an int value
		
	}
	
	
	
}
