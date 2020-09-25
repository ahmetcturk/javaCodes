package replItSolutions;


class Deck {
	private Card [] cards = new Card[52];

	public Deck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			
		}
	}
	
}

class Card {
	private String name;
	private int value;
	private String suit;
	public Card(String name, int value, String suit) {
		this.name = name;
		this.value = value;
		this.suit = suit;
	}
	
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", value=" + value + ", suit=" + suit + "]";
	}
	
	
	
}











public class Assignment_069 {
	public static void main(String[] args) {
		arraysDemo();
	}

	public static void arraysDemo() {
		// syntax for creating arrays:
		// type[] varname = new type[size];
		// or type[] varname = {element1, element2, e};

		// creates an integer array of length 5 with default values
		int[] intArr = new int[5];
		System.out.println(intArr.length + "\n"); // get length of intArr, note
													// no parentheses

		// creates an double array of length 5 with given values
		double[] doubArr = { 0.1, 0.2, 0.3, 0.4, 0.5 };
		// print out specific positions using Array indexing
		System.out.println(doubArr[0]);
		System.out.println(doubArr[1]);
		System.out.println(doubArr[2] + "\n");

		// loop through an array using its index (allows changes)
		for (int x = 0; x < doubArr.length; x++) {
			System.out.println(doubArr[x]);
		}
		System.out.println("\n");

		// loop through an array using a for-each loop
		String[] scrubs = { "Noah", "Rafael", "James" };
		for (String scrub : scrubs) {
			System.out.println(scrub + " is a scrub");
		} // this works similarly to python's "for element in array:"
			// where 'scrub' above can be any value, this will loop through
			// every value of scrubs, assigning each one to scrub

	}
}
