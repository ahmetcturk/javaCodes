package week81;

public class Abstract3_Ford extends Abstract3_Car {
	private int maxSpeed;

	public Abstract3_Ford() {
		
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
