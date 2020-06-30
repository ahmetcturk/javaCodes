package week9;

interface IMoveable{
	
	int AVG_SPEED = 60; // Static, public and final by default
	void moveForward();
	void moveBackward();	

}

class Animal implements  IMoveable{

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println("Animal moved foreward");
	}
	@Override
	public void moveBackward() {
		System.out.println("Animal moved backward");
		
	}	
}
class Vehicle implements IMoveable{
	// Overridden methods have to be public
	public void moveForward(){
		System.out.println("Vehicle moved forward");
	}
	public void moveBackward(){
		System.out.println("Vehicle moved backward");
	}
}
public class InterfaceConcept2 {

	public static void main(String[] args) {
		// Upcasting
		IMoveable vehicle1 = new Vehicle();
		System.out.println(IMoveable.AVG_SPEED);
		vehicle1.moveBackward();
		vehicle1.moveForward();
		
		vehicle1 = new Animal();
		vehicle1.moveBackward();
		vehicle1.moveForward();

	}

}
