package week9Tuesday;


interface IExample{
	// Variables are final, static and public by default
	int a = 6;
	// no concrete methods(except default-static)
	// abstract methods
	// Global variables
	// No constructor
	// Can not be instantiated
	
	abstract void message();// abstract method, abstract keyword is optional
}
interface IExample2{
	String message2();
}



public class InterfaceConcept1 implements IExample, IExample2 {
	
	public static void main(String[] args) {

	}

	@Override
	public void message() {
		System.out.println("Message");
	}

	@Override
	public String message2() {
		return "Message 2";
		
	}


}
