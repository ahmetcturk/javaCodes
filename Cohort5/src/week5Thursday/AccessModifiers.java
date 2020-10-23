package week5Thursday;

import week5Tuesday.ClassInDifferentPackage;

public class AccessModifiers {

	// public : Accessible from everywhere in project
	// private : Accessible only in class
	// default : Accessible only in same package
	// protected : Only accessible from subclasses
	public static void main(String[] args) {
		
		ClassInDifferentPackage obj = new ClassInDifferentPackage();
		
		obj.method3();
		// obj.method1(); compiler error because method1 is default
		ClassInDifferentPackage.method2();
		
		

	}

}
