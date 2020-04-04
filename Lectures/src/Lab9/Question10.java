package Lab9;

import java.util.ArrayList;

abstract class Animal{}
 interface Hunter{}
 class Cat extends Animal implements Hunter{}
 class Tiger extends Cat{}

public class Question10 {

	public static void main(String[] args) {
		ArrayList<Animal> arrayList = new ArrayList<>();
		arrayList.add(new Tiger());
		
		ArrayList<Hunter> arrayList2 = new ArrayList<>();
		arrayList2.add(new Cat());
		
		ArrayList<Hunter> arrayList3 = new ArrayList<>();
		arrayList3.add(new Tiger());
		
//		ArrayList<Tiger> arrayList4 = new ArrayList<>()
		//arrayList4.add(new Cat());
		
		ArrayList<Animal> arrayList5 = new ArrayList<>();
		arrayList5.add(new Cat());
		
	}

}
