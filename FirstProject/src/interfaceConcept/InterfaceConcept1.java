package interfaceConcept;

interface IMoveable{ 
	// All the classes which implements to this class will have Moveable attributes
	int AVG_SPEED = 60; // fields are final by default, no final keyword needed.
	void move();
}

class Vehicle implements IMoveable{

	@Override
	public void move() {
		System.out.println("Average speed is : " + AVG_SPEED);// AVG_SPEED from interface 
	}
	
}

public class InterfaceConcept1 {

	public static void main(String[] args) {
		// Creating objects with upcasting or normal is not different in this example
		// Objects will act same
		Vehicle vehicle = new Vehicle();
		vehicle.move(); // Average speed is : 60
		IMoveable vehicle2 = new Vehicle();
		vehicle2.move(); //Average speed is : 60
		
	}
}
