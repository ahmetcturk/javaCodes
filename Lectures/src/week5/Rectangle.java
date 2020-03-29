package week5;

public class Rectangle {
	
private double width;
private double length;

public double area(double width, double length){
	double area = width * length;
	return area;
}
public double perimeter(double width, double length){
	double perimeter = 2*(width + length);
	return perimeter;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle();
		rectangle1.length = 5;
		rectangle1.width = 10;
		System.out.println(rectangle1.area(9, 10));

	}

}
