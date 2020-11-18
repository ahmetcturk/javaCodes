package week9Tuesday;


interface IMoveable{
	int AVG_Speed = 60; // final - public - static
	void moveForward();
	void moveBackward();
	
}

class Animal implements IMoveable{

	@Override
	public void moveForward() {
		System.out.println("Animal Moves Forward");
		
	}

	@Override
	public void moveBackward() {
		System.out.println("Animal Moves backward");
		
	}
	
}
class Vehicle implements IMoveable{

	@Override
	public void moveForward() {
		System.out.println("Vehicle Moves Forward");
		
	}

	@Override
	public void moveBackward() {
		System.out.println("Vehicle Moves Backward");
		
	}
	
}

public class InterfaceConcept2 {

	public static void main(String[] args) {
		IMoveable moveable = new Vehicle(); // Upcasting
		moveable.moveForward();
		moveable.moveBackward();
		System.out.println(moveable.AVG_Speed);
		
		moveable = new Animal();
		moveable.moveBackward();
		
		
		
		
	}

}
