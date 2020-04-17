package week11;

// Static class and methods can only use static members of the class
public class StaticMethod {
	static int id;
	String name;
	
	static class staticClass{
		static void method1(){
			System.out.println(id);
			//System.out.println(name);
		}
	}
	public static void main(String[] args) {
		System.out.println(id);

	}
	void method(){
		System.out.println(id);
	}

}
