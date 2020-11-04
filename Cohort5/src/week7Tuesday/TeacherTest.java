package week7Tuesday;
// This example demonstrates encapsulation
public class TeacherTest {
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("John");
		teacher.setName("Ahmet");
		System.out.println(teacher.getName());
		teacher.setSalary(900);
		System.out.println(teacher.getSalary());
	}
	
}
class Teacher {
	// Global variables, instance variables, attributes
	private String name;
	private int salary;
	
	// Setter : Methods that set values to variables
	void setName(String name){
		this.name = name;
	}
	// Getter : Methods that get the variable values
	String getName(){
		return this.name;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
