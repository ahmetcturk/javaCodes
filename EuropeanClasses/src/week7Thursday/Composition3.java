package week7Thursday;
class Teacher{
	String name;
	int ID;
	public Teacher(String name, int iD) {
		this.name = name;
		ID = iD;
	}
	
}
class Student{
	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
}

class ClassRoom{
	Student student;
	Teacher teacher;
	public ClassRoom(Student student, Teacher teacher) {
		this.student = student;
		this.teacher = teacher;
	}	
}


public class Composition3 {

	public static void main(String[] args) {
		ClassRoom obj = new ClassRoom(new Student("Talha", 4290), new Teacher("Ahmet", 4298));
		System.out.println(obj.teacher.name);
		System.out.println(obj.student.name);
	}

}
