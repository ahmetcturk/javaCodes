package week7Tuesday;

import java.util.Arrays;

// Hierarchical Inheritance

class Employee {
	String name ; 
	int salary;
}

class Teacher2 extends Employee {
	int studentAmount;
}
class QAEngineer extends Employee{
	String [] certificates;
}
class BackEndDeveloper extends Employee{
	String [] languages;
}
public class InheritanceConcept {

	public static void main(String[] args) {
		Teacher2 teacher = new Teacher2(); 
		teacher.name = "Ahmet";
		teacher.salary = 3000;
		teacher.studentAmount = 125;
		
		QAEngineer engineer = new QAEngineer();
		engineer.name = "John";
		engineer.salary = 4000;
		String [] certificates = {"OCA", "Scrum", "ISTQB", "Python"};
		engineer.certificates = certificates;
		
		
		
		

	}

}
