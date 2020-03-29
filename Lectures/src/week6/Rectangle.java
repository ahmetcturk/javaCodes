package week6;

public class Rectangle {
private double width;
private double length;

public double getArea(){
	double area = width * length;
	return area;
	
}
public double getPerimeter(){
	double perimeter = 2*(width+length);
	return perimeter;
}

public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}


}
