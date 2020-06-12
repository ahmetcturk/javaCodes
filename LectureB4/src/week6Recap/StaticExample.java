package week6Recap;

public class StaticExample {

	static int count ;
	
	void increaseCount(){
		count ++;
	}
	
	public static void main(String[] args) {
	
		StaticExample object1 = new StaticExample(), object2 = new StaticExample(),
				object3 = new StaticExample();
		
		object1.increaseCount();
		object1.increaseCount();
		object3.increaseCount();
		object2.increaseCount();
		object3.increaseCount();
		
		System.out.println(object1.count);
		System.out.println(object2.count);
		System.out.println(object3.count);
		

	}

}
