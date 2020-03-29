package week5;

public class Personn {

	public String[] hobbies;
	public String[] friends;
	public void tellHobbies(){
		for (int i = 0; i < hobbies.length; i++) {
			System.out.println(hobbies[i]);
		}
	}
	public void tellFriends(){
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personn ahmet = new Personn();
		String arr [] = {"Sports", "Coding","Teaching"};
		ahmet.hobbies = arr;
		ahmet.tellHobbies();
		String arr1 [] = {"Cemil", "James","Richard"};
		ahmet.friends = arr1;
        ahmet.tellFriends();

	}

}
