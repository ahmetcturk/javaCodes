package week6a;



// This example demonstrates static concept
// Static fields - Class Level fields
// Static value will be shared among the object
public class JavaClassroom {
	
	String studentName;
	int studentID;
	static String teacherName;
	
	public static void main(String[] args) {
		JavaClassroom student1 = new JavaClassroom();
		student1.studentName = "Ahmet";
		student1.studentID = 4298;
		
		JavaClassroom student2 = new JavaClassroom();
		student2.studentName = "Bond";
		student2.studentID = 4299;
		
		JavaClassroom.teacherName = "Huseyin";
		student1.teacherName = "Dr. Ilhan";
		student2.teacherName = "Ahmet";
		
		System.out.println(student1.teacherName);
		System.out.println(student2.teacherName);
		

	}

}
