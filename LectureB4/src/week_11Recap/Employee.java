package week_11Recap;

import java.util.ArrayList;

public class Employee {
	
	ArrayList<String> nameList;

	public Employee() {
		nameList=new ArrayList<>();
	}
	
	void methodAddName(String name){
		nameList.add(name);
	}
	
}
