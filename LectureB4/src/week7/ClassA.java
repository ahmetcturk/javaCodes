package week7;

class ClassB{
	String bString;
	int bNumber;
	void methodB(){
		System.out.println("This is Class B method");
	}
}

public class ClassA extends ClassB {

	String AString;
	int ANumber;
	
	void method(){
		System.out.println("This is a Class A method");
	}
	public static void main(String[] args) {
		ClassA AObject = new ClassA();
		AObject.AString = "Field in Class A";
		AObject.ANumber = 7;
		AObject.method();
		AObject.methodB();
	}

}
