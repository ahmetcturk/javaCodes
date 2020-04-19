package April14_10Quetions;

public interface Readable {
	public void readBook();
	public void setBookMark();
	
	abstract class Book implements Readable{ //line1
		public void readBook(){}
											//line2
	}
	class Ebook extends Book{  				 //line3
		public void readBook(){
		}
	 public void setBookMark(){}			//line4 correct
	}

}
