package week81;

public class Mercedes extends Car{ 
 private int door;
 
 public Mercedes() {
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
