package week6;

public class TeacherTest {

	public static void main(String[] args) {
		Teacher object = new Teacher();
		object.setName("Stephen");
		object.setSalary(1000);
		
		System.out.println(object.getName());
		System.out.println(object.getSalary());
	}

}
