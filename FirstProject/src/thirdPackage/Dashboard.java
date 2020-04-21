package thirdPackage;

public class Dashboard {

	public static void main(String[] args) {
		AccessModifiers object = new AccessModifiers();
		object.method1();
		AccessModifiers.method2();
		AccessModifiers.method3();
		object.method4();
		//object.method5(); //- Compiler error
	}

}
