package secondPackage;

import thirdPackage.AccessModifiers;

public class WhiteBoard {

	public static void main(String[] args) {
	/*
	 *  Default methods are only reachable 
	 *  from the same package
	 */
	AccessModifiers object = new AccessModifiers();
	//object.method1(); // - Compiler Error
	//AccessModifiers.method2();// - Compiler Error
	AccessModifiers.method3();
	object.method4();
	//AccessModifiers.method5();//- Compiler Error
	}

}
