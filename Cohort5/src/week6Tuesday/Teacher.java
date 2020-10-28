package week6Tuesday;

public class Teacher {
	// What teachers has
	String name ;
	int numOfStudents;
	// What teachers does
	
	void teaches(){
		System.out.println("Teacher " + name + " teaches " + numOfStudents + " students");
	}
	
	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "Ahmet";
		teacher1.numOfStudents = 75;
		
		Teacher teacher2 = new Teacher();
		teacher2.name = "Ilhan";
		teacher2.numOfStudents = 200;
		
		teacher1.teaches();
		teacher2.teaches();
		
	}
	
		
}
