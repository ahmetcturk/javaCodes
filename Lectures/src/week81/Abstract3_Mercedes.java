package week81;

public class Abstract3_Mercedes extends Abstract3_Car{ 
 private int door;
 
 public Abstract3_Mercedes() {
}

public int getDoor() {
	return door;
}

public void setDoor(int door) {
	this.door = door;
}

@Override
int fuelPerHour() {
	return 3;
}
 
 
}
