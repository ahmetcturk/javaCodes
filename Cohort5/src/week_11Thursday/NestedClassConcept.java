package week_11Thursday;

// Class inside of a class
class Outer{
	// Inner - Nested Class
	class Inner{
		void print(){
			System.out.println("This is inner class");
		}
	}
	
	private class Inner2{
		void printer2(){
			System.out.println("Printer 2");
		}
	}
	
	void method(){
		new Inner2().printer2();
	}
}



public class NestedClassConcept {
	


	public static void main(String[] args) {
		//Outer outer = new Outer();
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
		new Outer().new Inner().print();
		new Outer().method();
		

	}

}
