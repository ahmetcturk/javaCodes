package week8Tuesday;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee(),
				employee2 = new Employee(),
				employee3 = new Employee();
		employee1.setName("Ahmet");
		employee2.setName("Talha");
		employee3.setName("Suzan");
		employee1.setSalary(1000);
		employee2.setSalary(2000);
		employee3.setSalary(3000);
		
		
		String [] nameOfEmp = {employee1.getName(),
				employee2.getName(), employee3.getName()};
		
		int [] salOfEm={employee1.getSalary(),
				employee2.getSalary(), employee3.getSalary()};
		
		
		
		
	}

}
