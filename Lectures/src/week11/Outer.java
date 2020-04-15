package week11;

public class Outer {
private int serialNumber = 10;
	 class Inner{
		int getValue(){
			return serialNumber;
		}
	}
	
	void displaySerialNumber(){
		Inner ic = new Inner();
		System.out.println("Serial Number : " + ic.getValue());
	}
	
	public static void main(String[] args) {
		Outer oClass = new Outer();
		oClass.displaySerialNumber();
		
		Outer.Inner object = oClass.new Inner();
		
		System.out.println("Serial Number : " + object.getValue());
	}
}

