package week5Tuesday;

public class MethodConcept2 {

	public static void main(String[] args) {
		MethodConcept2 object = new MethodConcept2();
		object.sayHello();
		object.sayBye();
		object.sayHello();
		// Challenge : Create a method which prints hello world for 2 times, and call it
		object.say2HelloWorld();
	}
	
	void say2HelloWorld(){
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
	
	
	void sayHello(){
		System.out.println("Hello");
	}
	
	void sayBye(){
		System.out.println("Bye");
	}

}
