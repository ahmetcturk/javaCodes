package week6Thursday;

public class PhoneTest {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone("Iphone", 500);
		
		System.out.println(phone1.brand);
		System.out.println(phone1.price);
		
		Phone phone2 = new Phone();
		System.out.println(phone2.brand);

	}

}
