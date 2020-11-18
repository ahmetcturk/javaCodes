package week4Tuesday;

public class MethodConcept2 {

	public static void main(String[] args) {
		System.out.println(fullName("Ahmet Can", "Turk"));
	}
	
//  Access Modifier
	//     return Type
		//        methodName
					//          Param1         Param2
 	static String fullName(String name, String lastName){
		System.out.println("Full Name Method is Working");
		String fullName = name +" "+ lastName;
		return fullName;
	}

}
