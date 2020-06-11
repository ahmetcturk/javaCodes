package week6a;

public class ComputerTest {

	public static void main(String[] args) {
		Computer object1 = new Computer();
		object1.setBrand("Apple");
		object1.setPrice(1000);
		
		System.out.println(object1.getBrand());
		System.out.println(object1.getPrice());
	}

}
