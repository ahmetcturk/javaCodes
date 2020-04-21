package interfaceConcept;

// This example demonstrates multi-level inheritance on Interfaces

interface IVehicle{
	public void hasWheels();
	public void hasEngine();
}
interface ICar extends IVehicle{
	// Any class which is going to implements this interface needs to implement 5 methods
	public void hasDoors();
	public void hasAirbags();
	public void hasRoofs();
}
interface IMotorcycle extends IVehicle{
	// Any class which is going to implements this interface needs to implement 4 methods
	public void hasPedal();
	public void hasHandlebars();
}

class Kawasaki implements IMotorcycle{

	@Override
	public void hasWheels() {
		
		
	}

	@Override
	public void hasEngine() {
		
		
	}

	@Override
	public void hasPedal() {
	
		
	}

	@Override
	public void hasHandlebars() {
		
		
	}
	
}







public class InterfaceConcept2 {

	public static void main(String[] args) {
		

	}

}
