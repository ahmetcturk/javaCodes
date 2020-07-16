package week_11Wednesday;

import ReviewPackage.SuperClass;

class Subclass extends SuperClass{
	void method1(){
		name();
	}
}


public class Visibility {

	// Access Modifiers : private, public , default, protected
	
	// private : accessible within same class
	// public : accessible from any class in the project
	// default : accessible from only same package
	// protected : accessible from same package, but it is 
	// accessible from subclass regardless of the package
	public static void main(String[] args) {
		SuperClass  superClass = new SuperClass();
		//superClass.name();
	
	}

}
