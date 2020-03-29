package week7;

public class Block {
	public static void main(String[] args) {
		Child object = new Child();
	}
}

class GrandParent{
	//fields - methods
	// Anonymous blocks
	{
		System.out.println("GrandParentClass");
	}
}
class Parent extends GrandParent{
	{
		System.out.println("ParentClass");
	}
}
class Child extends Parent{
	{
		System.out.println("Child Class");
	}
}
