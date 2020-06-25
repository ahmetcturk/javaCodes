package week8;

public class EmployeeTest {
	
	static void getEmployeeInfo(Employee reference){
		System.out.println(reference.getName());
		System.out.println(reference.getSSN());
		System.out.println(reference.getSalary());
		System.out.println(reference.CompanyName);
	}
	
	public static void main(String[] args) {
		
		Employee object = new Employee();
		Employee object1 = new Employee();
		
		object.setName("Ahmet");
		object.setSalary(1000);
		object.setSSN(350000000);
		
		object1.setName("Ilhan");
		object1.setSalary(1000);
		object1.setSSN(280000000);
	
		getEmployeeInfo(object);
		getEmployeeInfo(object1);
		
		
	}

}
