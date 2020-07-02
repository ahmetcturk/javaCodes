package week9Wednesday;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
// Arraylist has 3 constructors, 
// - Empty constructor
// - List parameter constructor
// - int initialCapacity constructor
public class Company {

	int number;
	ArrayList<String> employees;
	ArrayList<VectorExample> vectorExamples;
	ArrayList<Object> list; // It can store every kind of object reference
	public static void main(String[] args) {
		Company object1 = new Company();
		object1.number = 9;
		
		ArrayList<String> employeeList = 
				new ArrayList<>(Arrays.asList("Ahmet", "John", "Robert"));
		
		object1.employees = employeeList;
		
		ArrayList<VectorExample> vectorExamplesList = 
				new ArrayList<>(Arrays.asList(new VectorExample(),
						new VectorExample(),new VectorExample()));
		
		object1.vectorExamples = vectorExamplesList;
		
		ArrayList<Object> objectList = new ArrayList<>();
		objectList.add(4);
		objectList.add("String");
		
		object1.list = objectList;
		
		
	}
}
