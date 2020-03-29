package week7;



public class AmazonBookStore {
String name;
String lastname;
static int Comics = 120, SciFiNovels = 100, Biography = 130;
static int customer;
static int numOfBookSold;
static int numOfComicSold;
static int guestCustomer;
static int signUpCust;
public AmazonBookStore() {
	guestCustomer++;
	customer++;
	
}
public AmazonBookStore(String name, String lastname){
	// Signed up customers
	signUpCust++;
	this.name = name;
	this.lastname = lastname;
	customer++;
}

void buyComics(int amount){
	Comics -= amount;
	
	numOfBookSold += amount; // numOfBookSold = numOfBookSold + amount;
	numOfComicSold += amount;
}
void buyComics(){
	Comics -= 1; // Comics --
	numOfBookSold += 1; // numOfBookSold = numOfBookSold + amount;
	numOfComicSold += 1; // numOfComicSold++
}
void buySciFi(){
	SciFiNovels--;
	numOfBookSold++;
}
void buyBiography(){
	Biography--;
	numOfBookSold++;
}
	public static void main(String[] args) {
		
		AmazonBookStore customer1 = new AmazonBookStore(),
		customer2 = new AmazonBookStore(),
				customer3 = new AmazonBookStore();
		AmazonBookStore customer4 = AmazonBookStore("Ahmet", "Turk");

		customer1.buyComics(5);
		customer2.buySciFi();
		customer3.buyBiography();
		System.out.println(customer);
		
	}
	private static AmazonBookStore AmazonBookStore(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}


