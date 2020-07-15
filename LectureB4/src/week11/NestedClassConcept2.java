package week11;

class OuterClass1{
	
	private int x = 10;
	
	class InnerClass{
		int y = 5;
		void print(){
			System.out.println(x);
		}
	}
	void print(){
		InnerClass innerClass = new InnerClass();
		System.out.println(innerClass.y);
	}
}

public class NestedClassConcept2 {

	public static void main(String[] args) {
		
		OuterClass1 myOuterClass1 = new OuterClass1();
		OuterClass1.InnerClass myInnerClass = myOuterClass1.new InnerClass();
		
		

	}

}
