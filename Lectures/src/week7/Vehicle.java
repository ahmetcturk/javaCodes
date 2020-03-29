package week7;

public class Vehicle {
	
public int seat;
public double price;
public void does(){
	System.out.println("It carries people or items");
}

public static void main(String[] args) {
ElectricCar electricCar = new ElectricCar();
electricCar.carbonFootPrint = 9;
electricCar.seat = 4;
electricCar.price = 40000;
electricCar.does();
}

}

class Car extends Vehicle{
	public int horsePower;
	public void does(){
		System.out.println("Car can be use for traveling and sports events");
	}
}
class MotorCycle extends Vehicle{
	String type;
	public void does(){
		System.out.println("It carries people in two wheels");
	}
}
class HybridCar extends Car{
	public int carbonFootPrint;
	public int fuelPerMile;
	public void does(){
		System.out.println("Works with fuel and electric at the same time");
	}
	
}
class ElectricCar extends Car{
	public int carbonFootPrint;
	public void does(){
		System.out.println("Electric car is enviroment friendly");
	}
}