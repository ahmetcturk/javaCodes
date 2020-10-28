package week6Tuesday;

public class Person {
	// What person has
	// Global variables, attributes, instance variables, fields
	String name;
	int age;
	
	
	
	// What person does
	void speak(){
		System.out.println(name + " speaks");
	}
	
	void breathe(){
		System.out.println(name + " breathes");
	}
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Ahmet";
		person1.age = 26;
		
		person1.speak();
		person1.breathe();
		
		Person person2 = new Person();
		person2.name = "John";
		person2.age = 36;
		
		Person [] arr = {person1,person2};
		
		// Prints ages of users whose names is john
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].name.equals("John")) {
				System.out.println(arr[i].age);
			}
		}
		
		
		
	}
	
	
}
