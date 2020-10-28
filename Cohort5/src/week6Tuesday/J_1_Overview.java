package week6Tuesday;

public class J_1_Overview {

	// Methods are block of code which run only when it's called
	// Information can be passed to methods as parameters
	// We can add as many parameters as we want to the methods
	// And separate them with commas
	
	public static void main(String[] args) {
		method();
		method1("Ahmet", 26);
	}
	
	static void method1(String name, int age){
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
	}
	
	static void method(){
		System.out.println("I get invoked");
	}
	
	

}
