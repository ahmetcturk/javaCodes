package week7Tuesday;

import java.lang.Thread.State;

public class EncapsulationTest {

	public static void main(String[] args) {
		// Create an object and set values with setters, print values with getters
		EncapsulationExample object1 = new EncapsulationExample();
		object1.setAge(45);
		System.out.println(object1.getAge());
		
		EncapsulationExample reference = new EncapsulationExample("Ahmet", "8", 45);
		reference.setAge(35);
		System.out.println(reference.getAge());
		

	}

}
/*
 * Difference between methods and constructors
 * - Constructor					- Methods
 *  no return type					return type required
 *  Same name with class			can be name as anything
 *  initialize the object			performing functionality
 *  invoke implicitly				invoke explicitly
 *  can not be final or static
 */

class EncapsulationExample{
	private String name; 
	private String ID;
	private int age;
	
	public  EncapsulationExample(String name, String iD, int age) {
		this.name = name;
		ID = iD;
		this.age = age;
	}
	public EncapsulationExample() {
		
	}
	
	// Create getters and setters for the variables.

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}