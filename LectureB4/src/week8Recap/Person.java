package week8Recap;

public abstract class Person {
	// abstract method
	public abstract void speak();
	// concrete method
	public void healthInsurance(){
		System.out.println("If the position is full time, you have health insuarence");
	}
}

abstract class Employee extends Person{
	// Abstract classes doesn't have to override abstract methods in superclass
}

class FTEmployee extends Employee{

	@Override
	public void speak() {
		System.out.println("The position is full time");
		
	}
	public void benefits() {
		System.out.println("Benefits are good, but salary is less than in contract");
	}
	
	
}

class Contract extends Employee{

	@Override
	public void speak() {
		
		System.out.println("The position is contract");
		
	}
	
	public void benefits() {
		System.out.println("Salary is good, but benefits is not good in contract");
	}
	
}
