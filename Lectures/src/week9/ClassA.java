package week9;

interface InterfaceA{
	void message();
}

abstract class ClassB implements InterfaceA{
	
}

// Public classes needs their own files
public class ClassA extends ClassB{

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.message();

	}

	@Override
	public void message() {
		System.out.println("Hello Home !");
		
	}

}
