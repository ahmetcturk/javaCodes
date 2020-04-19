package April14_10Quetions;

// Which code fragment should you use it line n1 to instantiate the DVD object successfully?
class CD {
	int r;

	CD(int r){
		this.r =r;
	}
}
public class DVD extends CD {
	int c;

	DVD(int r, int c) {
		super(r);
		this.c = c;
	}

	public static void main(String[] args) {

		 DVD dvd = new DVD(10, 20);

	}

}
