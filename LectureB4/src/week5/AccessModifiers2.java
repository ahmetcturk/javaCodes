package week5;

public class AccessModifiers2 {

	public static void main(String[] args) {
		SecondClass secondClass = new SecondClass();
		secondClass.method1();
		// If my static method in the different class, we need to use Classname.method()
		SecondClass.method2();	
		// SecondClass.method3(); Compiler error, private method
		
	}

}

/* public : Publics methods are accessible from anywhere in the project
 * default : Default methods are accessible from only the same package
 * private : Private methods are accessible form only the same class
 */
class SecondClass{
	void method1(){ // Access Modifier : Default
		// non-static Method : 
		// When we want to call this method, we need to create object
		System.out.println("This is method 1");
	}
	
	static void method2(){ // Access modifier : default
		// static method : In order to call this method from another class
		// We need to use the class name
		System.out.println("This is method 2");
	}
	
	private static void method3(){ // Access modifier is private
		System.out.println("This is method 3");
	}
	
	public static void method4(){ // Access modifier is public
		System.out.println("This is method 4");
	}
	
	
	
	
	
	
	
	
}