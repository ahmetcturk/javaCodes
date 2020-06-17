package week7;
// We are using inheritance concept to categorize the classes
// Hierarchial Inheritance
class Employee{
	String name; 
	int salary;
	int sickDays;

}
class QAEngineer extends Employee{
	String certificates[];
}
class HouseWife extends Employee{
	int numberOfChildren;
}
class Teacher extends Employee{
	int studentNumbers;
}


public class InheritanceConcept2 {
	
	public static void main(String[] args) {
		HouseWife housewife = new HouseWife();
		housewife.name = "Myra";
		housewife.sickDays = 0;
		housewife.numberOfChildren = 3;
		
		QAEngineer engineer = new QAEngineer();
		engineer.name = "Ahmet";
		engineer.salary = 65000;
		engineer.sickDays = 15;
		String [] QACertificates = {"Java", "Python", "Scrum"};
		engineer.certificates = QACertificates;
		
		
	}
	
}
