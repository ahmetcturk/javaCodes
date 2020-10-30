package week6Thursday;

// This example will demonstrate static concept
// Static fields called as class level variables
public class JavaClassroom {

	String studentName;
	int studentID;
	static String teacherName;
		
	
	public static void main(String[] args) {
		
		JavaClassroom student1 = new JavaClassroom("John",4298);
		JavaClassroom student2 = new JavaClassroom("Wayne",4299);
		student1.teacherName = "Ahmet";
		student2.teacherName = "Mehmet";
		JavaClassroom.teacherName = "Ilhan";
		System.out.println(student1.teacherName);
		System.out.println(student2.teacherName);
		
	}

	public JavaClassroom(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}
	
	
	
	

}
