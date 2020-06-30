package week9;

interface IVehicle{
	void hasWheels();
	void hasEngine();
}

interface IMotorcycle extends IVehicle{
	void hasPedal();
	void hasHandleBars();
}

interface ICar extends IVehicle{
	boolean hasAirBags();
	boolean hasSunRoof();
	boolean hasDoors();
}

class Toyota implements ICar{

	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasAirBags() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasSunRoof() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasDoors() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
// Kawasaki (Motorcycle brand)
class Kawasaki implements IMotorcycle{

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
	public void hasHandleBars() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceConcept3 {

	public static void main(String[] args) {

	}

}
