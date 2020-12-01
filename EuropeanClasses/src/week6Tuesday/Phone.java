package week6Tuesday;

public class Phone {
	String brand; 
	int price;
	public Phone(String brand, int price) {
		System.out.println("2 Parameter Constructor");
		this.brand = brand;
		this.price = price;
	} 
	
	public Phone() {
		System.out.println("No Parameter Constructor");
	}
	
	public static void main(String[] args) {
		Phone phone1 = new Phone("Apple", 1000);
		Phone phone2  = new Phone();
	}
	
}
