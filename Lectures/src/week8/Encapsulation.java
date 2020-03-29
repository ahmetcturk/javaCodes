package week8;

public class Encapsulation{
	private String name;
	private String idNum;
	private int age;
	
	// info method
	public void info(){
		System.out.println("Name : " + getName() +
				"\nId Number : "  +getIdNum() +
				"\nAge : " + getAge());
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
