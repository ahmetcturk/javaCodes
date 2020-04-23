package inheritanceConcept;

// We are using inheritance concept to categorize the classes

class Employee {
	String name; 
	int salary;
}

class Teacher extends Employee{ // Teacher is a(n) Employee
	// Teacher will have Employee properties
	int studentNumbers;
}

class DataScientist extends Employee{
	int numberOfProject;
}

class HouseWife extends Employee{
	int numberOfChildren;
}

public class InheritanceConcept2 {

	public static void main(String[] args) {
		
	}
}