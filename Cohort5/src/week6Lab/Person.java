package week6Lab;

import java.util.Arrays;

public class Person {

	public String[] hobbies;
	public String[] friends;

	public void tellHobbies() {
		System.out.println(Arrays.toString(hobbies));
	}

	public void tellFriends() {
		System.out.println(Arrays.toString(friends));
	}

	public static void main(String[] args) {
		Person ahmet = new Person();
		String arr[] = { "Sports", "Coding", "Teaching" };
		ahmet.hobbies = arr;
		ahmet.tellHobbies();
		String arr1[] = { "Cemil", "James", "Richard" };
		ahmet.friends = arr1;
		ahmet.tellFriends();

	}

}
