package secondPackage;

public class Encapsulation{
	// Encapsulation is hiding the data
	// We will use private keyword to encapsulate our data 
	private String name ; // private keyword will hide the data within the class
	private String idNum; // it will not be reachable from outside of the class
	private int age;
	// in order to reach the methods and fields, we will use additional methods.
	// Getters - Setters
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
	

	// info method will return the fields
	public void info(){
		System.out.println("Name : " + getName() + 
		"\nID Number : " + getIdNum() +
		 "\nAge" + getAge() );
		}
	
	
	
}
