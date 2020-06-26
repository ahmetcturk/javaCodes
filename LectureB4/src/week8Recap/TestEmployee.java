package week8Recap;

public class TestEmployee {

	public static void main(String[] args) {
		
		Person person1 = new FTEmployee();
	    Person person2 = new Contract();
	    
	    person1.speak();
	    person2.speak();
	    person1.healthInsurance();
	    person2.healthInsurance();
		
	    Contract contract = new Contract();
	    contract.benefits();
	}

}
