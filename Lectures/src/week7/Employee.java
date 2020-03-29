package week7;

public class Employee {
String name;
int salary;
static void favoriteQuote(){
	System.out.println("(Sigh) Tomorrow is a work day...");
}
}
class Teacher extends Employee{
	int studentNumbers;
	String [] quizQuestions;
	// overriding method
	// difference between overloading and overriding
	static void favoriteQuote(){
		System.out.println("(angry) Call your parents to my office tomorrow.");
		//super.favoriteQuote();
	}
}
class DataScientist extends Employee{
	int numberOfProjects;
	String [] skills;
	static void favoriteQuote(){
		System.out.println("(sip coffee) The world is a big data problem");
	}
}

class HouseWife extends Employee{
	String numberOfChildren;
	String [] foodForTonight;
	static void favoriteQuote(){
		System.out.println("(to daughters) When i was in your age...");
	}
}