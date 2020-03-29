package week6;

import java.util.ArrayList;
import java.util.Scanner;

public class AmazonBookStore {
	
static int Comics = 120, SciFiNovels = 100, Biography = 130;

void buyComics(){
	Comics--;
}
void buySciFi(){
	SciFiNovels--;
}
void buyBiography(){
	Biography--;
}
	public static void main(String[] args) {
		
		AmazonBookStore customer1 = new AmazonBookStore(),
		customer2 = new AmazonBookStore(),
				customer3 = new AmazonBookStore();

		customer1.buyComics();
		customer2.buySciFi();
		customer3.buyBiography();
		
	}

}
