package week81;

public class Abstract3_UserScreen {
	public void show(Abstract3_Car cars) {
		Abstract3_Car car = cars;
		System.out.println("Weight : " + car.getWeight());
		System.out.println("Model : " + car.getModel());
		System.out.println("Color : " + car.getColor());
		System.out.println("Fuel Per Hour : " + car.fuelPerHour());

	}

}
