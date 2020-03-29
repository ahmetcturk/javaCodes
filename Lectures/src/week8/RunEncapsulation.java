package week8;


public class RunEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation object1 = new Encapsulation(),
				object2 = new Encapsulation();
		object1.setName("Ahmet");
		object1.setIdNum("4298");
		object1.setAge(30);
		
		object2.setName("John");
		object2.setIdNum("4299");
		object2.setAge(35);
		
	// show those two object values on the console
		System.out.println("Name : " + object1.getName() +
				"\nId Number : "  +object1.getIdNum() +
				"\nAge : " + object1.getAge());
		System.out.println("***************");
		object2.info();
		System.out.println("***************");
		object1.info();
		
	}

}
