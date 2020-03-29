package week71;

public class Tester {

	public static void main(String[] args) {
		
	Account ahmet = new Account("4298", "Ahmet Can Turk"), mehmet = new Account("3000", "Mehmet Agir", 9000),
			 rasim = new Account("5000", "Rasim Oztekin",5000);
	
	mehmet.transferTo(ahmet, 5000);
	rasim.transferTo(ahmet, 7000);
	System.out.println(ahmet.getBalance());
	System.out.println(mehmet.getBalance());
	System.out.println(rasim.getBalance());
	
	}
}
