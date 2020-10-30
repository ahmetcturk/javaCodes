package week6Thursday;

public class PencilTest {

	public static void main(String[] args) {	
		Pencil pencil1 = new Pencil();
		pencil1.color = "Red";
		pencil1.price = 1.99;
		pencil1.brand = "Faber Castel";
		
		Pencil pencil2 = new Pencil();
		pencil2.color = "Blue";
		pencil2.price = 2.99;
		pencil2.brand = "Rotring";
	}

}
// Classes are blueprint for objects
// Objects are instances(example) of classes

class Pencil{
	// What kind of attributes(instance variables) i can have
	
	String color;
	double price;
	String brand;

	// what a pencil does - behavior
	
	void write(String string){
		System.out.println("You wrote : " + string);
	}
}
