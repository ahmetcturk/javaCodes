package April13_10Questions;
class Vehicle{
	String type = "4W";
	int maxSpeed = 100;
	Vehicle (String type, int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
class Car extends Vehicle{
	String trans;
	Car(String trans, int maxSpeed){
		super(trans, maxSpeed);
		this.trans = trans;
	}
	Car(String type, int maxSpeed, String trans){
		super(type, maxSpeed);
		this.trans = trans;
	}
}


public class Question7 {

	public static void main(String[] args) {
		
		

	}

}
