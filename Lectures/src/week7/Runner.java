package week7;


public class Runner {

	public static void main(String[] args) {
		Teacher teacherObj = new Teacher();
		teacherObj.name = "Ahmet" ;
		HouseWife houseWife = new HouseWife();
		DataScientist dataScientist = new DataScientist();
		teacherObj.favoriteQuote();
		dataScientist.favoriteQuote();
		houseWife.favoriteQuote();
		Employee.favoriteQuote();
		
	
	}

}
