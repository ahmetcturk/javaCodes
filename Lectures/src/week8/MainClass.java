package week8;

class X
{
	void calculate(int a, int b)
	{
		System.out.println("Class X");
	}
}

class Y extends X
{
	@Override
	public void calculate(int a, int b)
	{
		System.out.println("Class Y");
	}
	
	void method(){
		super.calculate(2,9);
	}
}

public class MainClass 
{	
	public static void main(String[] args)
	{
		new Y().method();
	}
}
