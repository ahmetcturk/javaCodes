package week13Wednesday;

import java.util.ArrayList;

class Lister<E>{
	
	private E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}	
}
public class GenericClasses {

	public static void main(String[] args) {
		
		Lister<Integer> integerLister = new Lister<Integer>();
		integerLister.setE(4298);
		
		Lister <String> stringLister = new Lister<String>();
		stringLister.setE("Selenium");
		
		
	}

}
