package classConcept;

import java.util.Scanner;

// This class will hold the objects of CellPhone Class
public class CellPhoneTest {

	public static void main(String[] args) {
		String testMan; // To hold manufacturer
		String testMod; // To hold Model
		double testPrice; // To hold Price

		// Create a Scanner object for keybord input
		Scanner keyboard = new Scanner(System.in);

		// Get the manufacturer name
		System.out.println("Enter phone manucaturer : ");
		testMan = keyboard.nextLine();

		// Get the Model name
		System.out.println("Enter phone Model : ");
		testMod = keyboard.nextLine();

		// Get the Price name
		System.out.println("Enter phone Price : ");
		testPrice = keyboard.nextDouble();
		
		
		// Create an instance(object) of the Cellphone class
		// Passing the data that was entered as arguments
		// to the constructor
		
		CellPhone phone = new CellPhone();
		phone.manufactorer = testMan;
		phone.model = testMod;
		phone.retailPrice = testPrice;
		phone.info();
	}

}
