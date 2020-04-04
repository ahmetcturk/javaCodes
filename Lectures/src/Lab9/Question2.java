package Lab9;

interface A1
{
        	void myMethod();
}
class B
{
        	public void myMethod()
        	{
                    	System.out.println("My Method");
        	}
}
 
class C extends B implements A1 // Class C extends to Class B and implements interface A
{
	public void myMethod()
	{
            	System.out.println("My Method in Class C");
	} 
}


public class Question2 {

 	public static void main(String[] args)
	{
            	A1 a = new C();
               
            	a.myMethod();
	}

}

