package week8Tuesday;

public class Employee {
	// Encapsulated the fields with private keyword
	private String name;
	private int salary;
	private String profession;
	
	// Setter Profession
	void setProfession(String profession){
		this.profession = profession;
	}
	
	// Getter Profession
	String getProfession(){
		return profession;
	}
	
	
	// Setter Name;
	void setName(String name){
		this.name = name;
	}
	
	// Setter Salary
	void setSalary(int salary){
		this.salary = salary;
	}
	
	// Getter Name;
	String getName(){
		return name;
	}
	
	// Getter Salary
	int getSalary(){
		return salary;
	}

}
