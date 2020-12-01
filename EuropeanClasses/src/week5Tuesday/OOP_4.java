package week5Tuesday;
// This example demostrates that my method can work differently for different object attributes
public class OOP_4 {

	public static void main(String[] args) {
		CellPhone phone1 = new CellPhone();
		phone1.brand = "IPhone";
		phone1.OS = "IOS";
		phone1.RAM = 5;
		phone1.showPrice();
		
		CellPhone phone2 = new CellPhone();
		phone2.brand = "Samsung";
		phone2.OS = "Android";
		phone2.RAM = 4;
		phone2.showPrice();
		
		System.out.println(phone1.toString());
		System.out.println(phone2.toString());
	}

}

class CellPhone{
	// Fields
	String brand;
	String OS;
	int RAM;
	// Methods
	public String toString(){
		return "Brand : " + brand + "\nOS : " + OS + "\nRAM : " + RAM; 
	}
	
	void showPrice(){
		if (brand.equals("IPhone")) {
			System.out.println("Price is $1000");
		}
		else if (brand.equals("Samsung")) {
			System.out.println("Price is $600");
		}
		else if (brand.equals("HUAWEI")) {
			System.out.println("Price is $300");
		}
	}
	
	
}