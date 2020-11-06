package week7Thursday;


class Student{
	int rollNum;
	String name, course;
	float fee;
	public Student(int rollNum, String name, String course) {
		this.rollNum = rollNum;
		this.name = name;
		this.course = course;
	}
	
	public Student(int rollNum, String name, String course, float fee){
		this(rollNum, name, course);
		this.fee = fee;
	}
	void display(){
		System.out.println(this.rollNum + "\n" + name + "\n" + course + "\n" + fee);
	}
	
	
}
public class ThisKeywordConcept3 {

	public static void main(String[] args) {
		Student student = new Student(4, "John", "CSI", 10000);
		student.display();

	}

}
