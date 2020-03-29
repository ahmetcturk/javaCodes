package week8;

public class Book {
private String title;
private String author;
private int pages;
public Book() {
}
public Book(String title, String author, int pages) {
	this.title = title;
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
// getters, setters, info method 

public void info(){
	System.out.println("Author : " + getAuthor()+
			"\nTitle : " + getTitle() +
			"\nPages : " + getPages());
	System.out.println("*****************");
}

}
