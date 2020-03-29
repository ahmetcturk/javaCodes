package week6;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person("James",50 , "Agent");
		person1.setAge(9);
		System.out.println(person1.getAge());
		
		person1.setJob("Retired");
		System.out.println(person1.getJob());
		
		person1.setName("Bond");
		System.out.println(person1.getName());
		
		
		// Animal Class -- Fields : 
		// private String name;
		// private int age;
		// getters and setters for name-age
		// constructor with two parameters
		
		
		

	}

}
