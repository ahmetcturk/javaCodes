package week8Tuesday;

class Animal{
	
	int age;
	String gender;
	
	void eat(){
		System.out.println("Animal is eating");
	}
	void sleep(){
		System.out.println("Animal is sleeping");
	}
	static void communication(){
		System.out.println("Animal communicates");
	}

}

class Cat extends Animal {
	String name ;
	
	public Cat(String name, String g, int a) {
		this.name = name;
		gender = g;
		age = a;
	}
	void eat(){
		System.out.println("Cat is eating");
	}
	void sleep(){
		System.out.println("Cat is sleeping");
	}
	void meow(){
		System.out.println("Meow");
	}
}

class Dog extends Animal{
	String name; 
	void eat(){
		System.out.println("Dog is eating");
	}
	void sleep(){
		System.out.println("Dog is sleeping");
	}
	static void communication(){
		System.out.println("Dog communicates");
	}
}

public class OverridingConcept2 {

	public static void main(String[] args) {
	Cat cat = new Cat("Tom", "male", 2);
	System.out.println(cat.name);
	System.out.println(cat.gender);
	cat.eat();
	
	
	

	}

}
