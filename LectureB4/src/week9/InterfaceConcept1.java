package week9;


interface IInterface{
	// Variables are final and static by default, and can not be private
	int a = 9;
	// no concrete methods (default-static)
	// abstract methods
	// Global variables
	// No constructors
	// Can not be instantiated
	
	abstract void message(); // abstract method, abstract keyword is optional

}
interface IInterface2{
	abstract void message1();
}
class A implements IInterface, IInterface2{

	@Override
	public void message() {
		System.out.println("Message");
		
	}

	@Override
	public void message1() {
		System.out.println("Message1");
		
	}
	
}






public class InterfaceConcept1 {

}
