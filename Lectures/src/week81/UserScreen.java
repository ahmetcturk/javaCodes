package week81;

public class UserScreen {
	public void show(Car cars) {
		Car car = cars;
		System.out.println("Weight : " + car.getWeight());
		System.out.println("Model : " + car.getModel());
		System.out.println("Color : " + car.getColor());
		System.out.println("Fuel Per Hour : " + car.fuelPerHour());

	}

}
