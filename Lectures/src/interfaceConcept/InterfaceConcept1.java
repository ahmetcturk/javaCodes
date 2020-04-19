package interfaceConcept;

interface IMoveable{
	int AVG_SPEED = 60;
	void move();
}
class Vehicle implements IMoveable{

	@Override
	public void move() {
		System.out.println("Average speed is : " + AVG_SPEED);
	}
	
}
public class InterfaceConcept1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.move();

	}

}
