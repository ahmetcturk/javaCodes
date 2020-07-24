package week_11Recap;
// Local Classes are classes that we create inside a method

class LocalClassConcept{
	
	void method(){
		class Local{
			int a = 9;
			void method1(){
				System.out.println("Method1 inside of local class ");
			}
		}	
		System.out.println(new Local().a);
		new Local().method1();
	}
	
}

public class LocalClass {

	public static void main(String[] args) {
		new LocalClassConcept().method();
	}

}
