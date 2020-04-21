package thirdPackage;

class MyClass{
	public static void printOut(String string){
		System.out.println(string);
	}
}

public class StaticMethods {

	static void helloWorld(){
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		// We will learn calling way of static methods
		
		// In order to call static method from outside of the class : ClassName.methodName();
		MyClass.printOut("Hello From My Class");
		
		// in order to call static method from inside of the class : methodName();
		helloWorld();
		// different from the non-static method, we don't have to create
		// object in order to call methods
	}

}
