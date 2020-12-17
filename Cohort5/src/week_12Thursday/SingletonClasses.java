package week_12Thursday;
// Singleton class is a class desing only one instance can be created
// Other instances that have been creatged will look to the same object


class Singleton{
	// static variable single instance
	private static Singleton single_instance;
	
	public String string;
	
	// Private constructor
	private Singleton(){
		string = "Singleton string";
	}
	
	// method to create instance of singleton class
	public static Singleton getInstance(){
		if (single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}
	
}



public class SingletonClasses {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		System.out.println(obj1.string + "***" + obj2.string + "***" + obj3.string);
		obj1.string = obj1.string.toUpperCase();
		System.out.println(obj1.string + "***" + obj2.string + "***" + obj3.string);
		
	}

}
