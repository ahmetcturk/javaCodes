package week7Tuesday;


class Book{
	String title;
	String author;
	int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}

class EBook extends Book{
	int size;
	void download(){
		System.out.println("You are printing Ebook version" + 
	"size is " + size + "MB");
		
	}
}

class PaperBackBook extends Book{
	int pages = 300;
	void read(){
		System.out.println("You are reading the book, it has " + pages + " pages");
		System.out.println("You are reading the book, it has " + title + " title");
		System.out.println("You are reading the book, it's author is  " + author);
	}
}

class AudioBook extends  Book {
	int length = 10;
	void play(){
		System.out.println("You are listening audiobook, it will last " +length + " hours" );
	}
}



public class InheritanceConcept3 {

	public static void main(String[] args) {
		AudioBook audioBook = new AudioBook();
		audioBook.play();
		
		PaperBackBook obje = new PaperBackBook();
		obje.author = "Dan Brown";
		obje.title = "Angels and Demons";
		obje.read();

	}

}
