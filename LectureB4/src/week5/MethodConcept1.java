package week5;

public class MethodConcept1 {
	// Methods : methods are collection of statements which helps me
	// to organize my class logic

//  access modifier
//		^	access specifier
//		^	 ^	return type
//		^    ^     ^    Method name
//		^    ^     ^    ^     parameter
//		^    ^     ^    ^        ^

	public static void main(String[] args) {
	String string = "Ahmet Can Turk";
	System.out.println(string.length());
	// Scanner object = new Scanner(System.in);
	// Formula to create object : Classname objectname = new Classname();
	MethodConcept1 object = new MethodConcept1();
	// Call printHelloWorld Method
	object.printHelloWorld();
	
	object.printMultipleStrings();
	
	//              argument
	object.printNumber(10);
	
}
	void printNumber(int i){
		for (int j = 0 ; j<i ; j++) {
			System.out.println(j);
		}
	}
	
	// Minimum requirements : returnType methodname(){}
	void printHelloWorld(){
		System.out.println("Hello World");
	}
	
	void printMultipleStrings(){
		for(int i = 0; i < 10 ; i++){
			System.out.print("Java ");
		}
	}

}