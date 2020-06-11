package week6;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal object1 = new Animal();
		object1.method("Cat", 4);
		// Try to print object fields 
		
		
		
		Animal object2 = new Animal();
		//object2.type = "Dog"; // type is not visible

		System.out.println(object1.method2());
		
		
	}

}
