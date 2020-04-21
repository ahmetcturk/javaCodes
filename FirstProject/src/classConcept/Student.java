package classConcept;

public class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("You used two parameter constructor");
	}

	public Student() {
		System.out.println("You used no parameter constructor");
	}

	void info() {
		System.out.println(name);
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		Student object = new Student();
		object.name = "John";
		object.rollNo = 2;
		System.out.println("Name is : " + object.name + " " + "RollNo : " + object.rollNo);
		Student object2 = new Student("Ahmet", 123);
		object2.info();

	}
}
