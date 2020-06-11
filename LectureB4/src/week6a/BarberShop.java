package week6a;


public class BarberShop {

	static int custNumber;
	String customerName;
	public BarberShop() {
		custNumber++;
	}
	public BarberShop(String a) {
		customerName = a;
		custNumber++;
	}
	
	
	
	public static void main(String[] args) {
		
		BarberShop customer1 = new BarberShop();
		BarberShop customer2 = new BarberShop();
		BarberShop customer3 = new BarberShop();
		BarberShop customer4 = new BarberShop("Bob");
		
		// Task :Create a class which finds how many customer this barber shop has
		
		System.out.println(custNumber);
		
		

	}

}
