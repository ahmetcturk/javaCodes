package week81;

public class Ford extends Car {
	private int maxSpeed;

	public Ford() {
		
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	int fuelPerHour(){
		return 5;
	}
	
}
