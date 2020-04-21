package thirdPackage;

public class Initializing {
	// This class has getters-setters and constructors
	private String name;
	private int id;

	// Constructor 2 parameter
	public Initializing(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	// Constructor no parameter
	public Initializing() {
		
	}

	public void info(){
		System.out.println("Name : " + name + "\nID : " + id);
		System.out.println("***************");
	}
	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		// Different ways to initialize objects

		// Why we need constructors ?
		// We are using constructors to initialize objects
		// We used constructor while creating the reference, reference2 and reference3
		// reference and reference2 used non-parameter constructor, reference3 used 2 parameter constructor
		// Even if we don't create a constructor in class, java provides a default constructor (non-parameter)
		
		Initializing reference = new Initializing();
		// 1 ) Initializing trough direct access to fields with reference
		reference.name = "Ahmet";
		reference.id = 4298;
		
		Initializing reference2 = new Initializing();
		// 2 ) Initializing object trough methods (Setters)
		reference2.setName("Mike");
		reference2.setId(4299);
		
		Initializing reference3 = new Initializing("Tatar", 4301);
		// 3) Initializing object trough Constructor (2 parameter constructor is being used)
		
		reference.info();
		reference2.info();
		reference3.info();
	}

	// getters-setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
