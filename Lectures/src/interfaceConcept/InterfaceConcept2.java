package interfaceConcept;

interface IVehicle{
	// Any class which is going to implements this interface needs to implement 2 methods
	public void hasWheels();
	public void hasEngine();
}
interface Car extends IVehicle{
	// Any class which is going to implements this interface needs to implement 5 methods
	public void hasDoors();
	public void hasAirbags();
	public void hasRoof();
}
interface Motorcycle extends IVehicle{
	// Any class which is going to implements this interface needs to implement 5 methods
	public void hasPedal();
	public void hasHandlebars();
	public void hasStand();
}

class Kawasaki implements Motorcycle{

	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasPedal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasHandlebars() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasStand() {
		// TODO Auto-generated method stub
		
	}
	
}

class Toyota implements Car{

	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasDoors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasAirbags() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasRoof() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceConcept2  {

	public static void main(String[] args) {
		
	}

}
