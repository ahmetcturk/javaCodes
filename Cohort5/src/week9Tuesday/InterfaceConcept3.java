package week9Tuesday;

// This example demonstrates multilevel interface and class structure
interface IVehicle{
	void hasWheels();
	void hasEngines();
}
interface IMotorCycle extends IVehicle{
	void hasPedal();
	void hasHandBars();
}
interface ICar extends IVehicle{
	boolean hasDoors();
	boolean hasAirBags();
	boolean hasSunRoof();
}


class Kawasaki implements IMotorCycle{

	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasEngines() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasPedal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasHandBars() {
		// TODO Auto-generated method stub
		
	}
	
}
class Toyota implements ICar{

	@Override
	public void hasWheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasEngines() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasDoors() {
		// TODO Auto-generated method stub
		return false;
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
	
}
public class InterfaceConcept3 {

}
