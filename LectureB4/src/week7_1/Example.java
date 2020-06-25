package week7_1;

class Student1 {
	int rollno;
	String name, course;
	float fee;

	Student1(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student1(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

class TestThis7 {
	public static void main(String args[]) {
		Student1 s1 = new Student1(111, "ankit", "java");
		Student1 s2 = new Student1(112, "sumit", "java", 6000f);
		s1.display();
		s2.display();
	}
}

public class Example {

}
