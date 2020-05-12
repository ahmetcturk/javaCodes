package week2lab;
class student {
	String name;
	public student(String name) {
		this.name = name;
	}
}
public class Question {

	public static void main(String[] args) {
		student[] students=new student[3];
		//students [0]=new student("richard");
		students [1]=new student("richard");
		students[2]=new student("donald");	
		System.out.println(students[0]);


	}
}