package week5Thursday;

public class NonVoidMethods2 {

	public static void main(String[] args) {
		
		System.out.println(method1(9, 3));
		NonVoidMethods2 object = new NonVoidMethods2();
		System.out.println(object.getFullName("Ahmet", "Can"));
		object.getFullName1("John", "Wayne");
	}
	
	public void getFullName1(String name, String lastname){
		String fullName = name + " " + lastname;
		System.out.println("We are finding the name...");
		System.out.println(fullName);
	}
	
	public String getFullName(String name, String lastname){
		String fullName = name + " " + lastname;
		System.out.println("We are finding the name...");
		return fullName;
	}
	
	
	
	static double method1(int a , int b){
		return a / b;
	}
	
}
