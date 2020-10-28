package week6Tuesday;

public class CellPhone {
	String brand;
	String OS;
	int RAM;
	
	void report(){
		System.out.println("Brand : " + brand + "\nOS : " + OS + "\nRAM : " + RAM);
		System.out.println("******************************");
	}
	
	public static void main(String[] args) {
		CellPhone phone1 = new CellPhone();
		phone1.brand = "Iphone 12";
		phone1.OS = "IOS 14.0.1";
		phone1.RAM = 64;
		phone1.report();
		
		CellPhone phone2 = new CellPhone();
		phone1.brand = "Huawei Mate SE";
		phone1.OS = "Android Kitkat";
		phone1.RAM = 8;
		
		phone2.report();
		
	}
	
}





