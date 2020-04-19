package April15;

public class Question25 {
	
	String name;
	boolean contract;
	double salary;

	
	Question25(){
//		this.name = new String("Joe");
		
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);

	}
	
	public String toString(){
		return name + ":" + contract + ":" + salary;
	}

	public static void main(String[] args) {

		Question25 e = new Question25();
//		e.name = "John";
//		e.contract = true;
//		e.salary =100;
		
		
		System.out.println(e);

	}

}
