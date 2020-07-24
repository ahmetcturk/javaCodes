package week_11Recap;

public class Company {
	
	// Composition : Has-A
	String name;
	Employee employee;
	
	public Company(String name, Employee employee) {
		this.name = name;
		this.employee = employee;
	}

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.methodAddName("Ahmet");
		employee.methodAddName("Robert");
		employee.methodAddName("Amy");
		
		Company company = new Company("Silicone Labs", employee);
		
		System.out.println(company.employee.nameList);
		
		
		
		

	}

}
