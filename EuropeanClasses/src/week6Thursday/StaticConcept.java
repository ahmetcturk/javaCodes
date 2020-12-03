package week6Thursday;


class JavaClassroom{
	String name;
	String lastName; 
	// For common attribute for different object, we use static keyword
	// static variables are class level variables and they have same value in all objects
	static String teacherName;
	static String institution;
	
	public JavaClassroom(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	} 
	
}

public class StaticConcept {

	public static void main(String[] args) {
		JavaClassroom.teacherName = "Ahmet Can Turk";
		JavaClassroom.institution = "Silicone Labs";
		
		JavaClassroom student1 = new JavaClassroom("Talha", "Komurcu");
		JavaClassroom student2 = new JavaClassroom("Ibrahim", "Savran");
		student1.teacherName = "Professor Brown";
		student2.institution = "NJIT";
		
		System.out.println(student1.name + "-" + student1.lastName  + "-" + student1.teacherName + "-"
		+ student1.institution);
		System.out.println(student2.name + "-" + student2.lastName  + "-" + student2.teacherName + "-"
				+ student2.institution);

	}

}
