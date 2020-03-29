package week81;

abstract class Shape2{
public abstract double area();

					@Override
public String toString() {
return " [area()=" + area() + "]";
					}           

          }
 class Circle2 extends Shape2{
	int radius;

	public Circle2(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius*3*radius;
	}
	
 }
 class Rectangle2 extends Shape2{
int width;
int length;

public Rectangle2(int width, int length) {
	super();
	this.width = width;
	this.length = length;
}

@Override
public double area() {
	// TODO Auto-generated method stub
	return width * length;
}

	 
 }
 
public class AbstractTester5{
          public static void main(String args[])

          {
                   Shape2 vec[] = {new Circle2(3), new Rectangle2(4,5), new Circle2(4), new Circle2(8)};

                   for(int index = 0; index < vec.length; index ++)

                   {

                             System.out.println(vec[index]);

                   }
          }
}
