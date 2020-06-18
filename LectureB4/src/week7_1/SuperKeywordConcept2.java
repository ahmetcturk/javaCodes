package week7_1;
class SuperClass{
	int num = 4298;
	
}

class ChildClass extends SuperClass{
	int num = 4300;
	
	void printNumber(){
		// super class 
		System.out.println(num);// 4300
		System.out.println(new SuperClass().num); // 4298
		System.out.println(super.num); // 4298
		System.out.println(this.num); // 4300
		System.out.println(new ChildClass().num); // 4300
	}
}
public class SuperKeywordConcept2 {

	public static void main(String[] args) {
		
		new ChildClass().printNumber();

	}

}
