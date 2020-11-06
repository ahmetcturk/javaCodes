package week7Thursday;

// Composition in java
class Example2{
	int b;
	Example3 object;
}

class Example3{
	int a;
}

public class CompositionInJava {

	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.a = 9;
		
		Example2 example2 = new Example2();
		example2.object = example3;
		example2.b= 90;
		
		int number = example2.object.a;

	}

}
