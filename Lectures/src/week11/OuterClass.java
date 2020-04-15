package week11;

public class OuterClass {
	static int id = 4298;
	static String name = "Ahmet";
	void outerMethod(){
		System.out.println("Outer method");
	}
	static class Inner {
		void display(){
			System.out.println("Name : " + name);
			System.out.println("ID : "+id);
			
		}
		
	}
	
	public static void main(String[] args) {
		// Object for outer class
		OuterClass outerClass = new OuterClass();
		//outerClass.display(); // compiler error
		
		OuterClass.Inner inner = new OuterClass.Inner();
		Inner object = new Inner();
		inner.display();
		object.display();
		
		//inner.outerMethod();// -- compiler error
		
	}
}
