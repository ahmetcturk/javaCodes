package week7;
/*
 * Here we will learn to see how the different part (Anonymous Block, Constructor and Static Block) of class will behave
 * and what would be the order of execution
 * 
 */
class Blocks {
	// Anonymous Block
	{
		System.out.println("Anonymous Block");
	}
	
	// Static Block 
	static {
		System.out.println("Static Block");
	}
	
	public Blocks() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		// Create an object for Blocks Class
		Blocks object = new Blocks();
	}
}
