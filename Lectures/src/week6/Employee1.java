package week6;

public class Employee1 {

	// Fields - Attributes - Global Variable- instance variable
	String name;
	int age; 
	double salary;
	int workHours;
	
	public Employee1(String name, int age, double salary, int workHours) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.workHours = workHours;
	}

	public Employee1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void work(){
		salary = salary + 1000;
		workHours++;
	}
	
	void absence(){
		salary = salary - 50;
	}
	

}
