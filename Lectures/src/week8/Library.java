package week8;

public class Library {

	public static void main(String[] args) {
	// initialize 2 objects,
	// call both of them with using info method
	
	Book object1, object2;
	object1 = new Book();
	object2 = new Book();
	
	object1.setAuthor("Stephen King");
	object1.setPages(300);
	object1.setTitle("Angels And Demons");
	
	object2.setAuthor("Tonny Gaddish");
	object2.setPages(400);
	object2.setTitle("Starting out with Java");
	
	object1.info();
	object2.info();
	}

}
