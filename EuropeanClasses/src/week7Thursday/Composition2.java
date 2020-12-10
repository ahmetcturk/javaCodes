package week7Thursday;

import java.util.ArrayList;
import java.util.Arrays;


class Book{
	String title;
	String author;
	// Add Price
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
}

class BookStore{
	ArrayList<Book> booklist = 
			new ArrayList<>(Arrays.asList(new Book("Angels and Demons", "Dan Brown"), new Book("FM and I", "Anthony")));
	
	
	
	void buyBook(String name){
		
		for (Book book : booklist) {
			if (book.title.equals(name)) {
				System.out.println(name + " is available in our inventory");
				break;
			}
		}
	}
}

public class Composition2 {

	public static void main(String[] args) {
		BookStore obj = new BookStore();
		obj.buyBook("Ask");
	}

}
