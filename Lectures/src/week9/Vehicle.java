package week9;

public interface Vehicle {
public void showSpeed();
}

class Car implements Vehicle{

	@Override
	public void showSpeed() {
		System.out.println("Speed implementation");
		
	}
	
}

class Audi extends Car{
	public long MAX_SPEED = 250;
	
	public void showSpeed(){
		System.out.println("Speed Implementation in audi class");
	}
	
}