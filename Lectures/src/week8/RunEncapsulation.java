package week8;


public class RunEncapsulation {

	public static void main(String[] args) {
		Encapsulation object1 = new Encapsulation(),
				object2 = new Encapsulation();
		
		object1.setName("Ahmet");
		object1.setIdNum("4298");
		object1.setAge(30);
		
		object2.setName("Mike");
		object2.setIdNum("4299");
		object2.setAge(28);
		
		object1.info();
		System.out.println("*************");
		object2.info();
	}

}
