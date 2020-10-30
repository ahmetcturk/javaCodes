package week6Thursday;

public class AnimalTest {

	public static void main(String[] args) {
	
		Animal animal1 = new Animal();
		
		Animal animal2 = new Animal("Dog");
		
		Animal animal3 = new Animal(4);
		
		Animal animal4 = new Animal("Spider", 8);
		
		animal1.show();
		animal2.show();
		animal3.show();
		animal4.show();
		
	}

}
