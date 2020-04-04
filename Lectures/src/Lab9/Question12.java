package Lab9;
interface Readable{
	public void readBook();
	public void setBookMark();
	
}
abstract class Book implements Readable{
	public void readBook(){
		
	}
	
}
class EBook extends Book{

	public void readBook(){
		
	}

	@Override
	public void setBookMark() {
		// TODO Auto-generated method stub
		
	}
	

}
public class Question12  {

	public static void main(String[] args) {
		
		Book book1 = new EBook ();
		book1.readBook();


	}

}
