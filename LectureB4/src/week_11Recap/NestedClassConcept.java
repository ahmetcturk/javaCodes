package week_11Recap;
// Create a class inside a class (Nested Class)
// Create a class inside a method (Local Class) 
// Create a class inside a statement (Anonymous Class) 

class OuterName{
	private int a = 9;
	
	class InnerClass{
		private int b = 9;
		void method(){
			System.out.println(a);
		}
	}
	
	void outerMethod(){
		InnerClass innerClass = new InnerClass();
		System.out.println(innerClass.b);
	}
	
}

public class NestedClassConcept {

	public static void main(String[] args) {
		// Create an object for inner class
		OuterName outerName = new OuterName();
		OuterName.InnerClass innerClassObject = outerName.new InnerClass();
		innerClassObject.method();
		
	}

}
