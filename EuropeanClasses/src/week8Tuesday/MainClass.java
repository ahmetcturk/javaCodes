package week8Tuesday;

class A {
	int i = 10;

	void method(){
System.out.println("Europe");
}
}

class B extends A {
	int i = 20;

void method1(){
System.out.println("USA");
}

}

public class MainClass {
	public static void main(String[] args) {
		// Upcasting  : All the methods and fields will come from superclass
		// except overriden method, overriden methods will come from subclass
		A a = new B();
		a.method();
	}
}
