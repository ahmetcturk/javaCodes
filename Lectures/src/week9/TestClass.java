package week9;

abstract class TestInterface{
	abstract public void square(int a);
	static void show(){
		System.out.println("Static method");
	}
}
public class TestClass extends TestInterface {

	
	public static void main(String[] args) {
		TestInterface.show();

	}

	@Override
	public void square(int a) {
		System.out.println("Square method");
		
	}

}
