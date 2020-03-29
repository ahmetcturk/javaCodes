package week6;


public class Class1 {
	// fields-attributes
	private int x ;
	private String y;	
// There can be only one public class per source file.
// A source file can have multiple non-public classes.
	
public Class1(int xInt, String yString) {
	this.x = xInt;
	this.y = yString;
}	
public Class1() {
}
	public static void main(String[] args) {
		// initializing the object
		Class1 object = new Class1(9,"String");
		System.out.println(object.x + " " + object.y);
		
		object.x = 10;
		object.y = "Ahmet Can Turk";
		System.out.println(object.x + " " + object.y);
		
		Class1 object2 = new Class1();
		object2.x = 11;
		object2.y = "Ahmet";
	
		
		
		
		
	}
	
	
}
